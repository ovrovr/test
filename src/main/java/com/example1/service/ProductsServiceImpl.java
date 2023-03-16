package com.example1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example1.model.Products;
import com.example1.repository.ProductsRepo;

@Service
public class ProductsServiceImpl implements ProductsService {
@Autowired
ProductsRepo productrepo;

@Override
public Products saveProduct(Products product) {
	return	productrepo.save(product);
	}
}
