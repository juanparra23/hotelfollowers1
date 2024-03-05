/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basics;

import java.util.Scanner;
/**
 *
 * @author estudiantelis
 */
public class Reader {
    
    Scanner sc = new Scanner(System.in);
    
    public int readInt(String message, String errorMessage, String inErrorMessage){
        System.out.println(message + ": ");
        validateInt(errorMessage, inErrorMessage);
        int value = sc.nextInt();
        return value;
    }

    public double readDouble(String message, String errorMessage, String suggestionMessage){
        System.out.println(message + ": ");
        validateDouble(errorMessage, suggestionMessage);
        double dato = sc.nextDouble();
        return dato;
    }

    public double readFloat(String message, String errorMessage, String suggestionMessage){
        System.out.println(message + ": ");
        validateFloat(errorMessage, suggestionMessage);
        double dato = sc.nextFloat();
        return dato;
    }
    public String readString(String message){
        System.out.println(message +": ");
        String str = sc.next();
        return str;
    }
       
    public void validateInt(String errorMessage, String suggestionMessage) {
    	
    	while (!sc.hasNextInt()) {
            System.out.println(errorMessage);
            System.out.println(suggestionMessage);
            sc.next();
        }
    }
    
    public void validateFloat(String errorMessage, String suggestionMessage){
        while (!sc.hasNextFloat()) {
            System.out.println(errorMessage);
            System.out.println(suggestionMessage);
            sc.next();
        }
    }
    
    public void validateDouble(String errorMessage, String suggestionMessage){
        while (!sc.hasNextDouble()) {
            System.out.println(errorMessage);
            System.out.println(suggestionMessage);
            sc.next();
        }
    }
    
    public int readIntRange(int start, int end, String errorMessage,
                           String suggestionMessage) {
    	
        int number = 0;
        do {
            
            validateInt(errorMessage, suggestionMessage);
            number = sc.nextInt();
            
        } while (number < start && number > end );

        return number;
    }
    
    public int readPosInt(String errorMessage,
                           String suggestionMessage) {
    	
        int number = 0;
        do {
            
            validateInt(errorMessage, suggestionMessage);
            number = sc.nextInt();
            
        } while (number <= 0);

        return number;
    }
}
