/**
 * 
 */
package com.diaspark.INB.DTO;

import java.sql.Date;

import javax.validation.constraints.NotEmpty;

/**
 * @author Anoop Jain
 *
 */
public class AdminUserDTO {

    @NotEmpty(message="Please provide your username")
    private String username;

    @NotEmpty(message="Please provide your password")
    private String password;
    public Date getLastUsed() {
		return lastUsed;
	}

	public void setLastUsed(Date lastUsed) {
		this.lastUsed = lastUsed;
	}

	private Date lastUsed;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
