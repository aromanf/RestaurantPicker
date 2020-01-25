package com.aromanf.restaurantpicker;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(new Restaurant("Mc'Donalds", "Fast Food", "American",
                new ArrayList<>(Arrays.asList("Hamburgers", "Chicken"))));
        restaurants.add(new Restaurant("Kentucky Fried Chicken", "Fast Food", "American",
                new ArrayList<>(Arrays.asList("Hamburgers", "Chicken"))));

        System.out.println("-- Restaurant Picker Application --");
        RestaurantPicker picker = new RestaurantPicker(restaurants);
        System.out.println(picker.chooseRandomRestaurant());
    }
}
