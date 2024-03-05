/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelfollowers.kitchen;

/**
 *
 * @author estudiantelis
 */
public class Chef {
    
    private String name;
    private int id;
    private String location;

    public Chef() {
        
        name = "";
        id = 0;
        location = "";
    }

    public Chef(String name, int id, String location) {
        this.name = name;
        this.id = id;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    public void takeOrder(FoodItem food){
        
    }
    
    
    
}
