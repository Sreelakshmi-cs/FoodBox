package com.foodbox.FoodBox.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodbox.FoodBox.Model.product;
import com.foodbox.FoodBox.Repository.ProductRepository;


@Service
public class Productservice {
	
	@Autowired
	ProductRepository Prepo;
	
	//Method to List all Products
	public List<product>getAllProducts()
	{
		return Prepo.findAll();
	}
	
	//Method to save a product
	public void saveProduct(product pd)
	{
		Prepo.save(pd);
	}
	
	public void deleteProduct(int id)
	{
		Prepo.deleteById(id);
	}

}

