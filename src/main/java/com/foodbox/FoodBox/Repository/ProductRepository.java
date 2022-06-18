package com.foodbox.FoodBox.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodbox.FoodBox.Model.product;


@Repository
public interface ProductRepository extends JpaRepository<product,Integer>{

}
