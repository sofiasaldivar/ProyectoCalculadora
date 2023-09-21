
package calculadora;


/**
 * 
 * Método que convierte la infija a la postfija
 * @author <pre> Natalia Islas,
 * Daniela Pacheco, 
 * Sofía Saldívar 
 * y Sofía Zavala 
 * </pre>
 */
public class PostFij {
    
/**
 * Otorga la prioridad al caracter analizado
 * @param operator: caracter a definir su prioridad
 * 
 * @return <pre> Regresa 1 si el caracter es '$', 
 * 2 si es '/',
 * 3 si '+' o '-',
 * 4 si '(' 
 * y 0 si no es un operador conocido. Se asume que su prioridad es 0. 
 * 
 * </pre>
 */
    public static int prioridadSigno(char operator) {
        switch (operator) {
            case '$':
                return 1;
            case '/':
            case '*':
                return 2;
            case '+':
            case '-':
                return 3;
            case '(':
                return 4;
            default:
                return 0; // Si no es un operador conocido, asumimos prioridad 0
        }
    }
    
    /**
     * Método para comprobar si el caracter es un operador.
     * @param character
     * @return Regresa verdadero si el caracter es un operador.
     */

    public static boolean esOperador(char character) {
        return character == '+' || character == '-' || character == '*' || character == '/' || character == '$';
    }
    
    /**
     * Método para comprobar si el caracter es un número
     * @param character
     * @return Verdadero si es un número.
     */

    public static boolean esNumero(char character) {
        return Character.isDigit(character);
    }
    
    /**
     * <pre>
     * Método que convierte la cadena de infija a postija.
     * Analiza la cadena caracter por caracter. 
     * Dependiendo si es número, sugno o parentesis, lo acomoda de cierta forma. 
     * Después de recorrer toda la cadena, el método regresa la cadena en forma postfija.
     * 
     * </pre>
     * @param cadena: Cadena que puede contener número, signo o paréntesis  
     * @return La cadena convertida a postfija. 
     */

    public static String postFija(String cadena) {
        PilaA<Character> pila = new PilaA<Character>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);

            if (esNumero(c)) {
                while (i < cadena.length() && (esNumero(cadena.charAt(i)) || cadena.charAt(i) == '.')) {
                    sb.append(cadena.charAt(i));
                    i++;
                }
                sb.append(" ");
                i--;
            } else if (c == '(') {
                pila.push(c);
            } else if (c == ')') {
                while (!pila.isEmpty() && pila.peek() != '(') {
                    sb.append(pila.pop()).append(" ");
                }
                if (!pila.isEmpty() && pila.peek() == '(') {
                    pila.pop();
                }
            } else if (esOperador(c)) {
                while (!pila.isEmpty() && esOperador(pila.peek()) && prioridadSigno(pila.peek()) <= prioridadSigno(c)) {
                    sb.append(pila.pop()).append(" ");
                }
                pila.push(c);
            } else {
                if (c == '_') {
                    sb.append("0 ");
                    i++;
                    while (i < cadena.length() && (esNumero(cadena.charAt(i)) || cadena.charAt(i) == '.')) {
                        sb.append(cadena.charAt(i));
                        i++;
                    }
                    sb.append(" ");
                    sb.append("-");
                    sb.append(" ");
                    i--;
                }

            }
        }

        while (!pila.isEmpty()) {
            sb.append(pila.pop()).append(" ");
        }

        return sb.toString();
    }

    public static <T> int cuantosDatos(PilaA<T> pilaMain) {
        int res = 0;

        PilaA<T> pila2 = new PilaA<T>();
        while (!pilaMain.isEmpty()) {
            pila2.push(pilaMain.pop());
            res++;
        }
        while (!pila2.isEmpty()) {
            pilaMain.push(pila2.pop());
        }

        return res;
    }
    
    /**
     * Para realizar operaciones, con la cadena en postfija
     * @param cadena
     * @return 
     */

    public static double accionChar(String cadena) {
        double res = 0;
        PilaA<Double> numeros = new PilaA();
        char operador;
        double num1, num2, aux=0;
        

        for (int i = 0; i < cadena.length() - 1; i++) {
            if (esNumero(cadena.charAt(i))) {
                double resp=0;
                String au="";
                
                while (i < cadena.length() && (esNumero(cadena.charAt(i)) || cadena.charAt(i) == '.') ) {
                    au+=cadena.charAt(i);
                    i++;
                }
                resp=Double.parseDouble(au);
                numeros.push(resp);
                
                i--;
            } else if (esOperador(cadena.charAt(i))) {
                operador = cadena.charAt(i);
                switch (operador) {
                    case '+':
                        num1 = numeros.pop();
                        num2 = numeros.pop();
                        res = num1 + num2;
                        numeros.push(res);
                        break;
                    case '-':
                        num1 = numeros.pop();
                        num2 = numeros.pop();
                        res = num2 - num1;
                        numeros.push(res);
                        break;
                    case '*':
                        num1 = numeros.pop();
                        num2 = numeros.pop();
                        res = num1 * num2;
                        numeros.push(res);
                        break;
                    case '/':
                        num1 = numeros.pop();
                        num2 = numeros.pop();
                        res = num2 / num1;
                        numeros.push(res);
                        break;
                    case '$':
                        num1 = numeros.pop();
                        num2 = numeros.pop();
                        res = Math.pow(num2, num1);
                        numeros.push(res);
                        break;
                }
            }
        }
        res = numeros.pop();
        return res;
    }

    public static void main(String[] args) {

        String g = "12+3+(3*4)$_2";
        String e = "4/1+(34+21$34)/456";
        String a = "12+_3$2";
        String b = "12/_2+(2$_2)";
        String c = "_2+2";
        String h = "3$_2.2";
        String y="12+3";
        String l="1.2+3";
        
       // System.out.println(sintaxis("3$_2.2"));

        System.out.println(postFija(h));
        //System.out.println(postFija(l));

        System.out.println(accionChar(postFija(h)));
        
    }

}
