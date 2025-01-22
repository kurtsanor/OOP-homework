/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.homework;

/**
 *
 * @author keith
 */
public abstract class Sales {
    protected String ItemName;
    protected double price;
    
    public Sales (String ItemName, double price) {
        this.ItemName = ItemName;
        this.price = price;
    }
    
    public abstract double calculate ();
        
    
}
