package com.project.ShoppingProjectBackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.project.ShoppingProjectBackend.dao.CategoryDAO;
import com.project.ShoppingProjectBackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();

	static {

		Category category = new Category();

		// adding first category

		category.setId(1);
		category.setName("Television");
		category.setDescription("description of TV");
		category.setImageURL("CAT_1.png");

		categories.add(category);
		
		// adding second category
		
		category = new Category();

		category.setId(2);
		category.setName("Mobile");
		category.setDescription("description of mobile");
		category.setImageURL("CAT_2.png");

		categories.add(category);
		
		// adding third category
		
		category = new Category();

		category.setId(3);
		category.setName("Laptop");
		category.setDescription("description of Taptop");
		category.setImageURL("CAT_3.png");

		categories.add(category);

	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub

		return categories;
	}

	@Override
	public Category get(int id) {
		
		//enhance for loop
		
		for(Category category : categories)
		{
			if(category.getId()==id) return category;
		}
		
		
		return null;
	}
	
	

	
	
}
