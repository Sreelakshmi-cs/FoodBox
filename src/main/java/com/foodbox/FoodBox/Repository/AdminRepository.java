package com.foodbox.FoodBox.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodbox.FoodBox.Model.admin;


@Repository
public interface AdminRepository extends JpaRepository<admin,Integer> {

	admin findByUsername(String username);
}