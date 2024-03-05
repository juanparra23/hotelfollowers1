/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelfollowers.clients;

/**
 *
 * @author estudiantelis
 */
public class Feedback {
    
    private String nameClient;
    private String date;
    private String feedbackMessage;

    public Feedback() {
    }

    public Feedback(String nameClient, String date, String feedbackMessage) {
        this.nameClient = nameClient;
        this.date = date;
        this.feedbackMessage = feedbackMessage;
    }

    public String getFeedbackMessage() {
        return feedbackMessage;
    }

    public void setFeedbackMessage(String feedbackMessage) {
        this.feedbackMessage = feedbackMessage;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
}
