package com.example1.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example1.model.Products;

@Repository
public interface ProductsRepo extends CrudRepository<Products, Integer> {

}
