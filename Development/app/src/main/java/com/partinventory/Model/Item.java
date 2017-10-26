package com.partinventory.Model;

/**
 * Created by Lucas on 10/25/2017.
 */

public class Item {
    private int id;
    private String name;
    private String description;
    private int year;
    private int quantity;
    private float price = 0;

    public Item(){
        
    }

    private void genID(){

    }

    public boolean deleteItem(){
        return false;
    }

    public boolean sellItem(){
        return false;
    }

    //GETTERS
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getYear() {
        return year;
    }

    public int getQuantity() {
        return quantity;
    }

    public float getPrice() {
        return price;
    }
}
