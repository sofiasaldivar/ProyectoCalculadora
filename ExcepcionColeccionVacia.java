/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * 
 * Clase que arroja un comentario si el método tiene un error o si el método falla
* @author <pre> Natalia Islas,
 * Daniela Pacheco, 
 * Sofía Saldívar 
 * y Sofía Zavala 
 * 
 * </pre>
 * 
 * 
 */
public class ExcepcionColeccionVacia extends RuntimeException{

    public ExcepcionColeccionVacia() {
    }

    public ExcepcionColeccionVacia(String message) {
        super(message);
    }
    
    
    
}

