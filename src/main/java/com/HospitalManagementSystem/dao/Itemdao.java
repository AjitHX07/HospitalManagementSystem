package com.HospitalManagementSystem.dao;

import java.util.List;

import com.HospitalManagementSystem.dto.Item;

public interface Itemdao {
	public Item saveItem(int mid, Item item);

	public Item getItemById(int iid);

	public List<Item> getAllItems();

	public boolean deleteItemById(int iid);

	//public Item updateItemById(int iid);
}
