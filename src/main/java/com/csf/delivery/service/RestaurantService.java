package com.csf.delivery.service;


import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import com.csf.delivery.model.*;
import com.csf.delivery.repository.*;

//defining the business logic  
@Service 

public class RestaurantService {

	@Autowired  
	RestaurantRepository rs;  
	//getting all books record by using the method findaAll() of CrudRepository  

	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Restaurant> getAllRestaurants()   
	{  
		List<Restaurant> restaurants = new ArrayList<Restaurant>();  
		rs.findAll().forEach(restaurant1 -> restaurants.add(restaurant1));  
		return restaurants;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Restaurant getRestaurantsById(int id)   
	{  
		return rs.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Restaurant restaurants)   
	{  
		rs.save(restaurants);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		rs.deleteById(id);  
	} 

	//updating a record  
	public void update(Restaurant restaurants, int restaurantid)   
	{  
		rs.save( restaurants);  
	}  
}
