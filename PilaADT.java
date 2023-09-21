
package calculadora;

/**
 * 
 * Interface para clase PilaA
 * @author <pre> Natalia Islas,
 * Daniela Pacheco, 
 * Sofía Saldívar 
 * y Sofía Zavala 
 * </pre>
 */

public interface PilaADT <T>{
    public void push(T dato);
    public T pop();
    public boolean isEmpty();
    public T peek();
    
    
}