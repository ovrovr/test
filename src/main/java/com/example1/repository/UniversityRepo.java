package com.example1.repository;

import org.springframework.data.repository.CrudRepository;

import com.example1.model.University;

public interface UniversityRepo extends CrudRepository<University, Integer> {

}
