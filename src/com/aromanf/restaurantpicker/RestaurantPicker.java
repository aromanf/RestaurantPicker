package com.aromanf.restaurantpicker;

import java.util.ArrayList;
import java.util.Collections;

class RestaurantPicker {
    private ArrayList<Restaurant> restaurants;
    private boolean filterType;
    private String typeValue;
    private boolean cuisineType;
    private String cuisineValue;

    RestaurantPicker(ArrayList<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    Restaurant chooseRandomRestaurant() {
        Collections.shuffle(this.restaurants);
        if(!filterType) {
            return this.restaurants.get(0);
        }

        for(Restaurant restaurant : this.restaurants) {

            if(filterType && !cuisineType) {
                if(this.typeValue.equals(restaurant.getType())) {
                    return restaurant;
                }
            }
            if(filterType && cuisineType) {
                if(this.typeValue.equals(restaurant.getType())
                && this.cuisineValue.equals(restaurant.getCuisine())) {
                    return restaurant;
                }
            }

            if(!filterType && cuisineType) {
                if(this.cuisineValue.equals(restaurant.getCuisine())) {
                    return restaurant;
                }
            }
        }
        return null;
    }

    public void filterByType(String type) {
        this.filterType = true;
        this.typeValue = type;
    }

    public void filterByCuisine(String cuisine) {
        this.cuisineType = true;
        this.cuisineValue = cuisine;
    }
}
