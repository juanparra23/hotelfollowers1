/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelfollowers.roomservice;

import com.mycompany.hotelfollowers.clients.Client;

/**
 *
 * @author estudiantelis
 */
public class Nursing {
    
    private String name;
    private int id;
    private String location;

    public Nursing() {
    }

    public Nursing(String name, int id, String location) {
        
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
        return "Nursing{" + "name: " + name + ", id: " + id + ", location: " + location + '}';
    }
    
    public void nursingService(Client client){
        
    }
    
    
}
