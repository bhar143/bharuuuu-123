package com.product.Product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.Product.entity.Product;
import com.product.Product.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired 
	private ProductService productService;
	
	
	
	@PostMapping("/sortProducts")
	public List<Product> getProductList(){
		productService.getOrder();
		
		return getProductList();
	    	
		
		
	}
}
