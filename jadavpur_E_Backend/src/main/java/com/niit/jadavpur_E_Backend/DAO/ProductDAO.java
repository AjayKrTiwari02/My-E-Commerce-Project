package com.niit.jadavpur_E_Backend.DAO;

import java.util.List;

import com.niit.jadavpur_E_Backend.modal.Product;

public interface ProductDAO 
{
	boolean insert(Product product);
	boolean update(Product product);
	Product getProduct(int p_id);
	List<Product> listProduct();
	List<Product> listActiveProducts();	
	List<Product> listActiveProductsByCategory(int categoryId);
	List<Product> topPurchasedProduct();
}