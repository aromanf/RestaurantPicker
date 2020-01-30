package com.aromanf.restaurantpicker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

class RestaurantPicker {
    private ArrayList<Restaurant> restaurants;
    private boolean filterType;
    private String typeValue;

    RestaurantPicker(ArrayList<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    Restaurant chooseRandomRestaurant() {
        Collections.shuffle(this.restaurants);
        if(!filterType) {
            return this.restaurants.get(0);
        }

        for(Restaurant restaurant : this.restaurants) {

            if(this.filterType && this.typeValue.toLowerCase().equals(restaurant.getType().toLowerCase())) {
                return restaurant;
            }
        }
        return null;
    }

    public void filterByType(String type) {
        this.filterType = true;
        this.typeValue = type;
    }
}
