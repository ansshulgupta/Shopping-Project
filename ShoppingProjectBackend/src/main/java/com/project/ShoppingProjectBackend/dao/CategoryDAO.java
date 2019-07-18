package com.project.ShoppingProjectBackend.dao;

import java.util.List;

import com.project.ShoppingProjectBackend.dto.Category;

public interface CategoryDAO {

	List <Category> list();
	Category get(int id);
	
	
	
	
	
}
