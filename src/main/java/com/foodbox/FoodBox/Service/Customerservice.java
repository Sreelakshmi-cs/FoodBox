package com.foodbox.FoodBox.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodbox.FoodBox.Model.customer;
import com.foodbox.FoodBox.Repository.CustomerRepository;


@Service
public class Customerservice {
	
	@Autowired
	CustomerRepository Custrepo;
	
	    //Save the customer
		public void saveCustomer(customer cm)
		{
			Custrepo.save(cm);	
		}
		
		
		//verify Customer login
		public boolean customerCheck(String username, String password) {
			
			customer cm=Custrepo.findByUsername(username);
			if(cm.getUsername().equals(username)&&cm.getPassword().equals(password))
			{
				return true;
			}
			return false;
		}
		
		

}
