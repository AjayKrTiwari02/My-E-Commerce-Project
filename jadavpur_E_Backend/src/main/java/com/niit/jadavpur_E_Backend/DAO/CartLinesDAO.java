package com.niit.jadavpur_E_Backend.DAO;

import java.util.List;

import com.niit.jadavpur_E_Backend.modal.Cart;
import com.niit.jadavpur_E_Backend.modal.CartLines;
import com.niit.jadavpur_E_Backend.modal.OrderDetails;

public interface CartLinesDAO 
{
	public List<CartLines> list(int cartId);
	public CartLines get(int id);	
	public boolean add(CartLines cartLine);
	public boolean update(CartLines cartLine);
	public boolean remove(CartLines cartLine);
	boolean updateCart(Cart cart);
	public List<CartLines> listAvailable(int cartId);
	public CartLines getByCartAndProduct(int cartId, int productId);
	
	boolean addOrderDetail(OrderDetails orderDetail);
}