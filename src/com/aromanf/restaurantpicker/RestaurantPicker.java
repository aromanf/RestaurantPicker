package com.aromanf.restaurantpicker;

import java.util.ArrayList;
import java.util.Random;

class RestaurantPicker {
    private ArrayList<Restaurant> restaurants;

    RestaurantPicker(ArrayList<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    Restaurant chooseRandomRestaurant() {
        Random rng = new Random();
        int randomNumber = rng.nextInt(this.restaurants.size());
        return this.restaurants.get(randomNumber);
    }
}
