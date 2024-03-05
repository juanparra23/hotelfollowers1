/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hotelfollowers;

import java.util.Date;

import com.mycompany.hotelfollowers.registerandbilling.RegisterClient;
import com.mycompany.hotelfollowers.clients.Client;
import com.mycompany.hotelfollowers.registerandbilling.Room;
/**
 *
 * @author estudiantelis
 */
public class HotelFollowers {
    
    static Room[] bigRooms;
    static Room[] mediumRooms;
    static Room[] smallRooms;
    
    static int contRoom = 1;
    
    static RegisterClient reg = new RegisterClient();
    
    public static void main(String[] args) {
        
        // Asumiremos una cantidad fija de habitaciones creadas con el metodo createRooms
        createRooms();
        
        int option = reg.showRegisterMenu();
        
        while(option == 1){
            
            // Crea los cuartos
            createRooms();
            // Registrar
            Client client = reg.addClient();
            boolean register = reg.assignRoom(client, bigRooms, mediumRooms, smallRooms);
            if(register){
                System.out.println("Cliente registrado");
            } else {
                System.out.println("No hay habitaciones disponibles para el cliente \n" );
            }
            option = reg.showRegisterMenu();
        }
        
        System.out.println("Gracias por usar nuestro servicio");   
    }
    
    public static void createRooms(){
        
        // Creamos tres habitaciones tipo A: Grande
        bigRooms = new Room[3];        
        for(int i=0; i<3; i++){
            
            bigRooms[i] = new Room("A: Grande", contRoom,true,1);
            contRoom++;
        }
        // Creamos 6 habitaciones tipo B: Mediana
        mediumRooms = new Room[6];  
        for(int i=0; i<6; i++){
            
            mediumRooms[i] =new Room("B: Mediana", contRoom,true,1);
            contRoom++;
        }
        // Creamos 6 habitaciones tipo C: Pequeña
        smallRooms = new Room[6];  
        for(int i=0; i<6; i++){
            
            smallRooms[i] = new Room("C: Pequeña", contRoom,true,2);
            contRoom++;
        }
    }
}
