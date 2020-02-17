package com.aromanf.restaurantpicker.repository;

import com.aromanf.restaurantpicker.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {
}
