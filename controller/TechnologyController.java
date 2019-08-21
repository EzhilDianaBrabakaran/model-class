package com.mentorondemand.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mentorondemand.model.Technologies;
import com.mentorondemand.model.Trainings;
import com.mentorondemand.repo.TechnologyRepository;
import com.mentorondemand.repo.TrainingRepository;

@CrossOrigin(origins = "http://localhost:4321")
@RestController
@RequestMapping("/api")
public class TechnologyController {
	@Autowired
TechnologyRepository technologyRepo;
	
	
	@GetMapping("/getSkills/{id}")
	public Optional<Technologies> getAlSkills(@PathVariable long id) {
		System.out.println("Get all trainings details...");

		Optional<Technologies> technologies = technologyRepo.findById(id);

		return technologies;
	}
	
	
}
