package com.example1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example1.model.Products;
import com.example1.service.ProductsService;

@RestController
public class ProductsController {
	@Autowired
	ProductsService productsservice;
	
@PostMapping("/save")
public Products saveProduct(@RequestBody Products product) {
	return productsservice.saveProduct(product);
}

}
