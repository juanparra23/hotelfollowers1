/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// Código otorgado por los integrantes del grupo de la HU2
package com.mycompany.hotelfollowers.registerandbilling;

/**
 *
 * @author dlope
 */
public class Room {
    
    private String type;
    private int roomNo;
    private boolean status; // true if free
    private int block;
    private boolean maintenance;
    
     public Room() {
         
    }
    
    public Room(String type, int roomNo, boolean status, int block) {
        
        this.type = type;
        this.roomNo = roomNo;
        this.status = status;
        this.block = block;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return type + roomNo;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public boolean isMaintenance() {
        return maintenance;
    }

    public void setMaintenance(boolean maintenance) {
        this.maintenance = maintenance;
    } 
      
    public void modifyRoomStatus(boolean newStatus, boolean maintenance) {
        
        this.status = newStatus;
        this.maintenance = maintenance;
    }
}