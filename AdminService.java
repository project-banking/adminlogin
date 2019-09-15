/**
 * 
 */
package com.diaspark.INB.service;

import com.diaspark.INB.DTO.AdminUserDTO;


/**
 * @author Anoop Jain
 *
 */
public interface AdminService {
	String authenticateadmin(AdminUserDTO adminUserDTO);
}
