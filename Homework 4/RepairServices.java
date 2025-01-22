/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.homework;


public class RepairServices extends Sales {
    private int hours;
    
    public RepairServices (String ItemName, double price, int hours) {
        super(ItemName, price);
        this.hours = hours;
    }
    
    @Override
    public double calculate () {
        return hours * price;
    }
}
