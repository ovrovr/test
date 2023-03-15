package com.example1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example1.model.University;
import com.example1.service.UniversityService;

@RestController
public class UniversityController {
	@Autowired
	UniversityService universityService;
	@GetMapping("/dept")
  public String getDetails() {
	  return ;
  }
	@PostMapping("/dept")
	public University addDetails(@RequestBody University univ) {
		return  universityService.insert(univ);
	}

}
