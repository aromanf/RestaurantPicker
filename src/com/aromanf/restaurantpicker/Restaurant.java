package com.aromanf.restaurantpicker;

import java.util.ArrayList;

class Restaurant {
    private String name;
    private String type;
    private String cuisine;
    private ArrayList<String> foodOfferings;
    //private FoodMenu foodMenu;


    Restaurant(String name, String type, String cuisine, ArrayList<String> foodOfferings) {
        this.name = name;
        this.type = type;
        this.cuisine = cuisine;
        this.foodOfferings = foodOfferings;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", cuisine='" + cuisine + '\'' +
                ", foodOfferings=" + foodOfferings +
               // ", foodMenu=" + foodMenu +
                '}';
    }
}
