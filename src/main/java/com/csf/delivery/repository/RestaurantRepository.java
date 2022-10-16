package com.csf.delivery.repository;
import org.springframework.data.repository.CrudRepository;

import com.csf.delivery.model.Restaurant;
  
//repository that extends CrudRepository  
public interface RestaurantRepository extends CrudRepository<Restaurant, Integer>  
{  
}  

