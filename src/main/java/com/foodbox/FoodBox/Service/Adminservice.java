package com.foodbox.FoodBox.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodbox.FoodBox.Model.admin;
import com.foodbox.FoodBox.Repository.AdminRepository;


@Service
public class Adminservice {

	@Autowired
	AdminRepository Arepo;
	
	public boolean adminCheck(String username,String password)
	{
		admin ad=Arepo.findByUsername(username);
		if(ad.getUsername().equals(username)&&ad.getPassword().equals(password))
		{
			return true;
		}
		return false;
	}
	
	
	public admin getAdmin(String username) {
		return Arepo.findByUsername(username);
	}

	public void Passwordchange(admin ad)
	{
		Arepo.save(ad);
	}
	
}
