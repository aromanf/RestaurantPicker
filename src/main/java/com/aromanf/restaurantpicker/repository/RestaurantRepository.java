package com.aromanf.restaurantpicker.repository;

import com.aromanf.restaurantpicker.entity.Restaurant;
import org.springframework.data.repository.CrudRepository;

public interface RestaurantRepository extends CrudRepository<Restaurant, Integer> {
}
