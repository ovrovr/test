package com.example1.service;

import java.util.List;

import com.example1.model.Products;


public interface ProductsService {
	
	public Products saveProduct(Products product);
	
	public void remove(Integer pid);
	
	public List<Products> getProducts();

	public Products getOne(Integer pid);
	
	public Products updateOne(Products product,Integer pid);
}
