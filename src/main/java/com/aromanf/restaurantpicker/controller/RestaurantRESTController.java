package com.aromanf.restaurantpicker.controller;

import com.aromanf.restaurantpicker.entity.Restaurant;
import com.aromanf.restaurantpicker.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/api")
public class RestaurantRESTController {
    @Autowired
    private RestaurantRepository restaurantRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addNewRestaurant(
            @RequestParam String name, @RequestParam String type, @RequestParam String cuisine) {
        Restaurant restaurant = new Restaurant();
        restaurant.setName(name);
        restaurant.setType(type);
        restaurant.setCuisine(cuisine);
        restaurantRepository.save(restaurant);
        return "Saved";
    }

    @GetMapping(path = "/restaurants")
    public @ResponseBody Iterable<Restaurant> getAllRestaurants() {
        return restaurantRepository.findAll();
    }
}
