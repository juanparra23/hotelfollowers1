/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelfollowers.roomservice;
import com.mycompany.hotelfollowers.kitchen.FoodItem;

/**
 *
 * @author estudiantelis
 */
public class RoomService {
    
    private String name;
    private int id;
    private String location;

    public RoomService() {
    }

    public RoomService(String name, int id, String location) {
        this.name = name;
        this.id = id;
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "RoomService{" + "name: " + name + ", id: " + id + ", location: " + location + '}';
    }
    
    public void deliverOrder(FoodItem order){
        
    }
}
