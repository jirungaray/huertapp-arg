package com.huertapp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import com.googlecode.objectify.ObjectifyService;
import com.huertapp.model.Garden;

public class ObjectifyBoostrap extends HttpServlet {

	@Override
	public void init() throws ServletException {
		ObjectifyService.register(Garden.class);
		
//		Shop temp = new Shop("test", 1, "calle 123", "1232345646", "www.test.com", -34.615799, -58.456148, "mañana");
//		new ShopRepository().save(temp);
//		
//		Product product= new Product(123456777l, 123l, "Test prod", "Test brand", Product.PRODUCT_SEMAPHORE_GREEN, null, true, false, true, false);
//		new ProductRepository().save(product);
//		ObjectifyService.register(ProductCategory.class);
//		ObjectifyService.register(Recipe.class);
		
		
	}
	 
	
}
