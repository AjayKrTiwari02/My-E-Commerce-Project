package com.niit.jadavpur_E_Backend.DAO;

import java.util.List;

import com.niit.jadavpur_E_Backend.modal.Address;
import com.niit.jadavpur_E_Backend.modal.User;




public interface UserDAO 
{
	public boolean insert(User user);
	public User getUser(String email);
	public List<User> getSupplierList();
	
	public boolean insertAddress(Address address);
	public Address getBillingAddress(int user_id);
	public List<Address> getShippingAddress(int user_id);
	
	public Address getAddress(int address_id);
	
}