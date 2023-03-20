package com.example1.service;


import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example1.model.Products;
import com.example1.repository.ProductsRepo;

@Service
public   class ProductsServiceImpl implements ProductsService {

@Autowired
ProductsRepo productrepo;

@Override
public Products saveProduct(Products product) {
	return	productrepo.save(product);
	}

@Override
public void remove(int pid) {
	productrepo.deleteById(pid);
}
@Override
public List<Products> getProducts(){
	List<Products>productdetails= new ArrayList<Products>();
	productrepo.findAll().forEach(pro->productdetails.add(pro));
	return productdetails;
}
@Override
public Products getOne(int pid) {
return productrepo.findById(pid).get();

}
}
