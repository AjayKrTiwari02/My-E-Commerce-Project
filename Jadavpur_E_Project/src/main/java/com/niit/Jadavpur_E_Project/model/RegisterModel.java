package com.niit.Jadavpur_E_Project.model;

import java.io.Serializable;



import com.niit.jadavpur_E_Backend.modal.Address;
import com.niit.jadavpur_E_Backend.modal.User;

public class RegisterModel implements Serializable 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private User user;
	private Address billing;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Address getBilling() {
		return billing;
	}
	public void setBilling(Address billing) {
		this.billing = billing;
	}
}
