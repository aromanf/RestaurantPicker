package com.aromanf.restaurantpicker;

import java.util.ArrayList;

class Restaurant {
    private String name;
    private String type;
    private String cuisine;
    private ArrayList<String> foodOfferings;
    //private FoodMenu foodMenu;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public ArrayList<String> getFoodOfferings() {
        return foodOfferings;
    }

    public void setFoodOfferings(ArrayList<String> foodOfferings) {
        this.foodOfferings = foodOfferings;
    }

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
