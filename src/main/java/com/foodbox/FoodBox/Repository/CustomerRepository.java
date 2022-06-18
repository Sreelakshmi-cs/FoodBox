package com.foodbox.FoodBox.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodbox.FoodBox.Model.customer;


@Repository
public interface CustomerRepository extends JpaRepository<customer,Integer> {

	customer findByUsername(String username);

}