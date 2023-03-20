package com.example1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example1.model.Products;
import com.example1.service.ProductsService;

@RestController
public class ProductsController {
	
@Autowired
ProductsService productsservice;

@PostMapping("/product")
public Products saveProduct(@RequestBody Products product) {
	return productsservice.saveProduct(product);
}

@DeleteMapping("/product/{pid}")
public void remove(@PathVariable int pid) {
	productsservice.remove(pid);
}

@GetMapping("/product")
public List<Products> getProducts(){
	return productsservice.getProducts();
}

@GetMapping("/product/{pid}")
public Products getOne(@PathVariable int pid) {
	return  productsservice.getOne(pid);
}
}
