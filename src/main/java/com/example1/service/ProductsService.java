package com.example1.service;

import java.util.List;

import com.example1.model.Products;


public interface ProductsService {
	
	public Products saveProduct(Products product);
	
	public void remove(int pid);
	
	public List<Products> getProducts();

	public Products getOne(int pid);
}
