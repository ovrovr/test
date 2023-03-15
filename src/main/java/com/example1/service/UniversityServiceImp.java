package com.example1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example1.model.University;
import com.example1.repository.UniversityRepo;
@Service
public class UniversityServiceImp implements UniversityService {

	@Autowired
	UniversityRepo universityRepo;
	@Override
	public University insert( University univ) {
		
		
		return universityRepo.save(univ); 
	}
	@Override
	public University retrive() {
		
		List<University> university=(List<University>) universityRepo.findAll();
		return  (University) university;
	}
	

}
