package examenfinalparte2;

import javax.swing.JOptionPane;

public class Principal {
 /**
     * Variable que en caso de ser true, indica que es un numero primo.
     */
    public static boolean p = false;
    /**
     * Programa para visualizar los numeros primos con el numero de digitos que ha introducido el usuario
     * @param arg 
     */
    public static void main(String arg[]){
        /**
         * Aqui pedimos por pantalla que ingresemos el numero de digitos que queremos que se nos muestre.
         * @param ndig es igual a 0 para que no tome otro valor.
         */
        
        int dig= Integer.parseInt(JOptionPane.showInputDialog("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): "));
        int ndig=0;
        
        
     /**
      * Si el dígito es mayor que 0 se procede a funcionar el bucle, si se pone cero no iniciará el bucle.
      */
        
        if(dig<=0)
        System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        
        
 
       
 
    
}