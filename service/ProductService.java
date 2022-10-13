package com.product.Product.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.product.Product.entity.Product;
@Service
public class ProductService {

	private List<Product> list = new ArrayList<>();
	public Product getOrder() {
		Product pro = new Product();
		pro.setProductId("prob1");
		pro.setProductName("Shirt");
		pro.setUnitOfMeasure("Each");
		pro.setLaunchDate(new Date(22-9-2022));
		Product pro1 = new Product();
		pro1.setProductId("prob2");
		pro1.setProductName("Tousers");
		pro1.setUnitOfMeasure("Each");
		pro1.setLaunchDate(new Date(19-8-2021));
		Product pro2 = new Product();
		pro2.setProductId("prob3");
		pro2.setProductName("Tie");
		pro2.setUnitOfMeasure("Each");
		pro2.setLaunchDate(new Date(7-8-2022));
		
		list.add(pro);
		list.add(pro1);
		list.add(pro2);
		
		//list.stream().sorted(Comparator.comparing(Product::getProductId).reversed()).collect(Collector.toList());
		
		list=list.stream().sorted(Comparator.comparing(Product::getProductId).thenComparing(Product::getLaunchDate)).collect(Collectors.toList());
		
		return pro;
	}

}
