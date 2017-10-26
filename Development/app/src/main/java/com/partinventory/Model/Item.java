package com.partinventory.Model;

/**
 * Created by Lucas on 10/25/2017.
 * Edited by Adam on 10.25.2017
 */

public class Item {
    private int id;
    private String name;
    private String description;
    private int year;
    private float price = 0;

<<<<<<< HEAD
    public Item(){

=======
    public Item(String Part_Name, String Part_Desc, int Part_Year, float Sell_Price){
        name = Part_Name;
        description = Part_Desc;
        year = Part_Year;
        price = Sell_Price;
>>>>>>> a7153cda96d6d67b22850ba21fa26479a2eb705c
    }

    private void genID(int id){

    }

    //GETTERS
    public int getId(int id) {

        return id;
    }

    public String getName(String name) {

        return name;
    }

    public String getDescription(String description) {

        return description;
    }

    public int getYear(int year) {
        return year;
    }

    public int getQuantity(int quantity) {
        return quantity;
    }

    public float getPrice(int price) {
        return price;
    }
}
