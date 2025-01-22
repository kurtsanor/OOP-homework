/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.homework;


public class Phone extends Sales{
    int quantity;
    
    public Phone (String ItemName, double price, int quantity) {
        super(ItemName,price);
        this.quantity = quantity;
    }
    
    @Override
    public double calculate () {
        return price * quantity;
    }
        
}
