package com.diaspark.INB.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diaspark.INB.DTO.AdminUserDTO;
import com.diaspark.INB.service.AdminService;
@RestController
@RequestMapping("/admin")
public class AdminController {
	 @Autowired
	 private AdminService adminService;
	
	 @PostMapping("/adminlogin")
	    public String authenticateadmin(@RequestBody AdminUserDTO adminUserDTO) {
	        return adminService.authenticateadmin(adminUserDTO);
	    }
}
