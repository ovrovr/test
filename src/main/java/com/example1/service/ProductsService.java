package com.example1.service;

import org.springframework.stereotype.Service;

import com.example1.model.Products;

@Service
public interface ProductsService {
	public Products saveProduct(Products product);
}
