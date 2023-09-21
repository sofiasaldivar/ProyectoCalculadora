/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;


/**
 *
 * Determina la prioridad de signos, diferencia los números positivos de los negativos y los números de los signos. 
 * 
* @author <pre> Natalia Islas,
 * Daniela Pacheco, 
 * Sofía Saldívar 
 * y Sofía Zavala 
 * 
 * </pre>
 * 
 */
public class MetodosIniciales {
    
    /**
     * 
     * Método que define la prioridad del caracter
     * @param operador: caracter a analizar
     * @return Regresa un número dependiendo de la prioridad del signo (1 si es '$', 2 si '/' o '*', 3 si '+' o '-' y 4 si ')'.
     */
    public static int signoPrioridad(char operador){
        int nivel=0;
        
        switch(operador){
            case '$':
                nivel=1;
                break;
            case '/':
                nivel=2;
                break;
            case '*':
                nivel=2;
                break;
            case '+':
                nivel=3;
                break;
            case '-':
                nivel=3;
                break;
            case '(':
                nivel=4;
                break; 
                
        } return nivel;
    }
    
    /**
     * Utiliza método "signoPrioridad" para determinar cuál de los dos caracteres tiene un nivel más alto y así determinar cuál tiene mayor prioridad.
     * @param car1
     * @param car2
     * @return Regresa "1" si el primer caracter es prioridad, "2" si es el segundo y "0" si son iguales
     */
    
    public static int queSignoPrioridad(char car1, char car2){
        int fin1=signoPrioridad(car1);
        int fin2=signoPrioridad(car2);
        int resp;
        
        if(fin1<fin2)
            resp=1; //el primero es prioridad
        else if (fin1>fin2)
            resp=2; //el segundo es prioridad
        else
            resp=0;
        
        return resp;   
    }
    
    /**
     * Método que determina si el caracter es signo o número
     * @param car
     * @return Si el caracter es un signo regresa el número "0", si es número regresa "1". 
     */
    public static int signoONum(char car){
        int resp;
        
        if(car=='+' || car=='-' || car=='*' || car=='/' || car=='(' || car==')' || car=='$')
            resp=0;
        else
            resp=1; //numero
        
        return resp;
    }
    
    /**
     * Determina si el caracter es un signo o número negativo
     * @param car
     * @return 
     */
    
    public static int signoONumNeg(char car){
        int resp;
        
        if(car=='+' || car=='-' || car=='*' || car=='/' || car=='(' || car==')' || car=='$')
            resp=0;
        else
            if(car == '_')
                resp=1; 
            else
                resp=0; //numero
        
        return resp;
    }
    
}
