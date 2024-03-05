/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelfollowers.registerandbilling;

import java.util.Date;

import basics.Reader;
import com.mycompany.hotelfollowers.clients.Client; 
import java.util.Set;


/**
 *
 * @author estudiantelis
 */
public class RegisterClient {
    
    Reader reader = new Reader();
    
    public int showRegisterMenu(){
        
        System.out.println("Por favor eliga una opción para continuar");
        System.out.println("1. Registrar Cliente");
        System.out.println("2. Salir");
        
        int number = reader.readIntRange(1, 2, "Valor no válido", "Debe ingresar solo una "
                + " opción entre 1 o 2");
        
        return number;
        
    }
    
    public Client addClient(){
        
        String name = reader.readString("Ingrese el nombre del cliente: ");
        System.out.println("Ingrese el número id del cliente");
        int id = reader.readPosInt("número invalido", "El número de identificación debe ser positivo");
        System.out.println("Ingrese el número de telefono del cliente:");
        int phone = reader.readPosInt("número invalido", "El número de telefono debe ser positivo");
        String address = reader.readString("Ingrese la dirección del cliente");
        Date date = new Date();
        // Creamos un cliente nuevo
        
        System.out.println("1. Registrar Cliente");
        System.out.println("2. Salir");
        return new Client(name, id, phone, address);
    }
    
    public boolean assignRoom(Client client, Room[] bigRooms, Room[] medRooms, Room[] smallRooms){
        
       System.out.println("Qué tipo de habitación desea? Ingrese un número de acuerdo a las "
                + "siguiente opciones: 1. A: Grande, 2. B: Mediana, 3. C: Pequeña");
       
       int option = reader.readIntRange(1, 3, "Valor no válido", "Debe ingresar una opción de 1 a 3");
       
       Date entry = new Date();
       Room[] rooms;
       
       switch(option){
           
           case 1:
               rooms = bigRooms;
               break;
           case 2:
               rooms = medRooms;
               break;
           case 3:
               rooms = smallRooms;
               break;  
           default:
               rooms = smallRooms;
               
       }      
      
       for(Room room : rooms){
           
           if(room.getStatus()){
               client.checkIn(entry, room);
               return true;
           }
       }
       
       System.out.println("No se pudo asignar el cuarto deseado para el cliente");
       return false; 
       
    }
    
}
