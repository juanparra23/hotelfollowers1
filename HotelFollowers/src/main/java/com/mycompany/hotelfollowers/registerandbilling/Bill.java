/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelfollowers.registerandbilling;

/**
 *
 * @author estudiantelis
 */
public class Bill {
    
    private int billNo;
    private String clientName;
    private float totalCost;

    public Bill() {
    }

    public Bill(int billNo, String clientName, float totalCost) {
        this.billNo = billNo;
        this.clientName = clientName;
        this.totalCost = totalCost;
    }

    public int getBillNo() {
        return billNo;
    }

    public void setBillNo(int billNo) {
        this.billNo = billNo;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public float getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(float totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public String toString() {
        return "Bill{" + "billNo: " + billNo + ", Client Name:" + clientName + ", Total Cost=" + totalCost + '}';
    }
    
    
     
}
