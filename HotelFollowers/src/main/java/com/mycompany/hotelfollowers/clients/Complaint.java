/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelfollowers.clients;

/**
 *
 * @author estudiantelis
 */
public class Complaint {
    
    private String clientName;
    private String date;
    private String complaintMessage;

    public Complaint() {
    }

    public Complaint(String clientName, String date, String complaintMessage) {
        this.clientName = clientName;
        this.date = date;
        this.complaintMessage = complaintMessage;
    }

    public String getComplaintMessage() {
        return complaintMessage;
    }

    public void setComplaintMessage(String complaintMessage) {
        this.complaintMessage = complaintMessage;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
}
