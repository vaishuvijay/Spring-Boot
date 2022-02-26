package com.RESTAPI;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {
	@Autowired  
	private IProductsService ProductsService;  
	//mapping the getProduct() method to /product  
	@GetMapping(value = "/Products")  
	public List<Products> getProducts()   
	{  
	//finds all the products  
	List<Products> products = ProductsService.findAll();  
	//returns the product list  
	return products;  
	}  

}
