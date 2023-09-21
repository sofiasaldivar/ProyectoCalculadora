
package calculadora;

/**
 * 
 * PilaA contiene a los métodos básicos para la funcionalidad correcta de una pila.
 * @author <pre> Natalia Islas,
 * Daniela Pacheco, 
 * Sofía Saldívar 
 * y Sofía Zavala 
 * </pre>
 * 
 * <pre>
 *Clase PilaA genérica, implementa los métodos de la interface PilaADT, también genérica.
 *Los atributos son: un entero que indica el tope, un arreglo de tipo T, y el máximo de datos que pueden ser almacenados en ese arreglo. 
 * </pre>
 */
public class PilaA <T> implements PilaADT<T>{
    private int tope;
    private T[]datos;
    private final int MAX=20;
    
    /**
     * El constructor de la pila crea el arreglo con el máximo dado en los atributos y establece el tope en -1 para indicar que la pila está vacía.
     */

    public PilaA() {
        datos=(T[]) new Object[MAX];
        tope=-1; //PARA INDICAR QUE LA PILA ESTA VACIA
    }
    
    /**
     * El constructor de la pila crea el arreglo con el máximo dado como parámetro por el usuario y establece el tope en -1 para indicar que la pila está vacía.
     */
    
    public PilaA(int MAX) {
        datos=(T[]) new Object[MAX];
        tope=-1; 
    }

    public int getTope() {
        return tope;
    }
    
    /**
     * <pre>
     * Método vacío que agrega nuevos datos a la pila. 
     * El usuario da el dato a agregar como parámetro. Se comprueba si hay espacio en la pila. En caso de que no haya se utiliza el método "expande", el cual
     * duplica el largo del arreglo para que haya espacio suficiente para agregar nuevos datos.
     * 
     * </pre>
     * @param datoNuevo: dato que es agregado a la pila 
     */

    public void push(T datoNuevo) {
        if(tope == datos.length-1) //no hay espacio en la pila 
            expande();
        tope++;
        datos[tope]=datoNuevo;
           
    }
    
    private void expande(){
        T[]masGrande =(T[])new Object[datos.length*2];
        
        for(int i=0; i<=tope; i++)
            masGrande[i]=datos[i];
        datos=masGrande;
    }
    
    /**
     * Método que establece dato del tope de la pila en null. En caso de estar la pila vacía, llama al método de "ExceptionColeccionVacia".
     */

    public T pop() {
        if(this.isEmpty())
            throw new ExcepcionColeccionVacia("Error: la pila esta vacía");
        T resultado=datos[tope];
        datos[tope]=null;
        tope--;
        return resultado;
    }
    
    /**
     * Método que permite comprobar si la pila está vacía o no. Si el tope es igual a -1, la pila no tiene elementos.  
     */

    public boolean isEmpty() {
        return tope ==-1;
    }
    
    /**
     * Permite al usuario saber el dato que está en el tope de la pila en caso de no estar vacía.
     * @return Si la pila no está vacía, devuelve el dato. Si no, devuelve el mensaje "Error: la pila esta vacía". 
     */

    public T peek() {
        if(this.isEmpty())
            throw new ExcepcionColeccionVacia("Error: la pila esta vacía");
        return datos[tope];
    }
    
    /**
     * Permite eliminar n datos de la pila, si es que el tope de la pila + 1 es mayor a n. Si no, no se elimina ningñun dato.
     * @param n: número de datos a eliminar
     */


   public void multiPop(int n){
       
        if(tope+1>=n){
            for(int i=0; i<n; i++){
               datos[tope]=null;
               tope--;
            }
        } 
        else{
            throw new ExcepcionColeccionVacia("Error: no hay ese numero de elemntos en la pila");         
        }
    }
   
   public String toString(){
       StringBuilder cad=new StringBuilder();
       PilaA<T> guarda=new PilaA();
       
       while(!isEmpty()){
           guarda.push(pop());
           cad.append(guarda.peek()+" ");
       }
       while(!guarda.isEmpty()){
           push(guarda.pop());
       }
       return cad.toString();
    }
}