/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelfollowers.management;

/**
 *
 * @author estudiantelis
 */
public class Manager {
    
    private String name;
    private int id;
    private int phoneNumber;
    private String location;

    public Manager() {
    }

    public Manager(String name, int id, int phoneNumber, String location) {
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
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

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Manager{" + "name=" + name + ", id=" + id + ", phoneNumber=" + phoneNumber + ", location=" + location + '}';
    }
    
    public void recordComplaints(){
        
    }
}
