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

    public Item(String Part_Name, String Part_Desc, int Part_Year){
        name = Part_Name;
        description = Part_Desc;
        year = Part_Year;
    }

    private void genID(int id){

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

    public float getPrice() {
        return price;
    }
}
