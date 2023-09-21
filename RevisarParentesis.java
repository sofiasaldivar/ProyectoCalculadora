/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 * 
 * Analiza el balance de los paréntesis
 * @author <pre> Natalia Islas,
 * Daniela Pacheco, 
 * Sofía Saldívar 
 * y Sofía Zavala 
 * </pre>
 *
 *  <pre>
 *
 * </pre>
 */
public class RevisarParentesis {
    
/**
 * <pre>
 *Analiza la sintaxis para asegurar que el balance de los paréntesis es correcto.
 * </pre>
 * @param cad: cadena a analizar
 * @return Regresa verdadero si la sintaxis de la cadena es correcta
 */

public static boolean revisaCad (String cad){
        boolean res=true;
        char can;
        int i=0;
        PilaA<Character> pil=new PilaA<Character>();
        
        while(i < cad.length() && res){
            can=cad.charAt(i);
            if(can == '('){
                pil.push(can);    
            }
            else{
                if(can== ')'){
                    if(pil.isEmpty()){
                        i=cad.length();
                        res=false;
                    }
                    else
                        pil.pop();
                }
            }
            i++;  
        }
        return pil.isEmpty() && res; 
    }
}
