package com.mentorondemand.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.mentorondemand.model.Admin;
import com.mentorondemand.model.Login;
import com.mentorondemand.repo.LoginRepository;

@CrossOrigin(origins = "http://localhost:4321")
@RestController
@RequestMapping("/api")
public class LoginController {

	@Autowired
	LoginRepository loginRepo;

	@GetMapping("/getRole/login")
    public String getRole(@RequestBody Login login) {
	
			Login result = loginRepo.findByEmailAndPassword(login.getEmail(), login.getPassword());
			return result.getRole();
		
}
	
	@PostMapping(value = "/loginCredentials/register")
	public Login postCustomer(@RequestBody Admin admin) {

		Login loginInsert = loginRepo.save(new Login(admin));
		return loginInsert;
	}

}
