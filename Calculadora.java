
package calculadora;


/**
 *
 * 
 * <pre>
 *Clase que comprueba la sintaxis de los datos a analizar
 * </pre>
 * @author <pre> Natalia Islas,
 * Daniela Pacheco, 
 * Sofía Saldívar 
 * y Sofía Zavala 
 * 
 * </pre>
 * 
 
 */

public class Calculadora {
    
    /**
     * Método que compara un caracter para determinar si es un signo, un número o un paréntesis.
     * @param car: caracter analizado
     * 
     * 
     * @return <pre>número 0 si el caracter es un signo ('+','-', '*', '/', '$'),
     *número 2 si es un paréntesis izquierdo,
     *número 1 si es un número. 
     * </pre>
     */
    public static int signoNumParentesis(char car){
        int resp;
        
        if(car=='+' || car=='-' || car=='*' || car=='/' || car=='$')
            resp=0;
        else if (car=='(')
            resp=2;
        else
            resp=1;
        
        return resp;
    }
    
    /**
     * <pre>
     * Método que asegura que la sintaxis de la cadena sea correcta
     * Se llama a los métodos "signoNumParentesis" y "RevisarParentesis"
     * </pre>
     * 
     * @param dato: Una cadena que puede contener números, signos y paréntesis
     * @return Regresa verdadero si la sintaxis es correcta
     */
    
    public static boolean sintaxis(String dato){
        boolean res=true;
        char car;
        int i=0, adentro=-1, afuera=-1; 
        PilaA<Character> pila=new PilaA <Character>();
        PilaA<Character> pila2=new PilaA <Character>();
        
        
        if(signoNumParentesis(dato.charAt(0)) == 0){ //SI HAY UN SIGNO AL PRINCIPIO
                res=false;
            }
        
        if(!RevisarParentesis.revisaCad(dato)){ //REVISAR QUE ESTEN BALANCEADOS LOS PARENTESIS 
            res=false;
        }
         
            i=0;
            while(dato.length()> i+1 && res){
                pila2.push(dato.charAt(i));
                car=dato.charAt(i+1);
                adentro=signoNumParentesis(pila2.peek());
                afuera=signoNumParentesis(car);
                if((adentro==2 || adentro==0) && afuera==0) //para ver si hay dos signos juntos o un ( y despues un signo
                    res=false;
                i++;
                pila2.pop();
            }
        
        return res;
    }

    
    public static void main(String[] args) {
        String a="12+_3.2";
        
        System.out.println(sintaxis(a));
    }
    
}
