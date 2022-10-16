package com.csf.delivery.controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.csf.delivery.model.*;
import com.csf.delivery.service.*;

//mark class as Controller  


@RestController 
@CrossOrigin(origins = "*")

public class RestaurantController {

	//autowire the BooksService class  
	@Autowired  
	RestaurantService restaurantService;  

	//creating a get mapping that retrieves all the books detail from the database   
	@GetMapping("/restaurant")
	
	private List<Restaurant> getAllRestaurants()   
	{  
		return restaurantService.getAllRestaurants();  
	}  


	@GetMapping("/restaurant/{restaurantid}")  
	private Restaurant getRestaurants(@PathVariable("restaurantid") int restaurantid, RestaurantService RS)   
	{  
		return RS.getRestaurantsById(restaurantid);  
	}  


 
	@DeleteMapping("/restaurant/{restaurantid}")  
	private void deleteRestaurant(@PathVariable("restaurantid") int restaurantid)   
	{  
		restaurantService.delete(restaurantid);  
	} 

	@PostMapping("/restaurant")  
	private int saveRestaurant(@RequestBody Restaurant restaurant)   
	{  
		restaurantService.saveOrUpdate(restaurant);  
		return restaurant.getId();  
	} 


	//@CrossOrigin(origins = "*")
	@PutMapping("/restaurant")  
	private Restaurant update(@RequestBody  Restaurant restaurant)   
	{  
		restaurantService.saveOrUpdate(restaurant);  
		return restaurant;  
	}  
}
