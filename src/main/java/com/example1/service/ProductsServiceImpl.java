package com.example1.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example1.model.Products;
import com.example1.repository.ProductsRepo;

@Service
public abstract   class ProductsServiceImpl implements ProductsService {

@Autowired
ProductsRepo productrepo;

@Override
public Products saveProduct(Products product) {
	return	productrepo.save(product);
	}

@Override
public void remove(Integer pid) {
	productrepo.deleteById(pid);
}
@Override
public List<Products> getProducts(){
	List<Products>productdetails= new ArrayList<Products>();
	productrepo.findAll().forEach(pro->productdetails.add(pro));
	return productdetails;
}
@Override
public Products getOne(Integer pid) {
    return productrepo.findById(pid).get();
}
@Override
public Products updateOne(Products product,Integer pid) {
Optional <Products> optional=productrepo.findById(pid);
	Products p1=optional.get();
	p1.setPid(pid);
	p1.setPname(product.getPname());
	p1.setPprice(product.getPprice());
	return productrepo.save(p1);
}


}
