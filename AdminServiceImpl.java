/**
 * 
 */
package com.diaspark.INB.service.impl;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diaspark.INB.DTO.AdminUserDTO;
//import com.diaspark.INB.entity.Admin;
//
//import com.diaspark.INB.repository.AdminRepository;

import com.diaspark.INB.service.AdminService;

/**
 * @author Anoop Jain
 *
 */
@Service
public class AdminServiceImpl implements AdminService {
	
	
//    private AdminRepository adminRepository;
	
    @Override
    public String authenticateadmin(AdminUserDTO adminUserDTO){
//        Admin existingadmin = adminRepository.findUserByUsername(adminUserDTO.getUsername());
//        System.out.println(existingadmin);
        if(adminUserDTO.getUsername() == "Ayushi" ||  adminUserDTO.getPassword() == "admin"){
            return "Authentication passed";
        }
        return "Authentication Failed";
    }
	
}
