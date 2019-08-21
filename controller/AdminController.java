package com.mentorondemand.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mentorondemand.model.Admin;
import com.mentorondemand.repo.AdminRepository;

@CrossOrigin(origins = "http://localhost:4321")
@RestController
@RequestMapping("/api")
public class AdminController {

	@Autowired
	AdminRepository adminRepo;
	
	@PostMapping(value = "/admin/register")
	public Admin postCustomer(@RequestBody Admin admin) {

		Admin adminInsert = adminRepo.save(new Admin(admin.getAdminId(),admin.getName(),admin.getEmail(),admin.getPassword(),admin.getContact(),admin.getStatus(),admin.getRole()));
		return adminInsert;
	}
	

}
