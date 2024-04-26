package com.HospitalManagementSystem.Control;

import com.HospitalManagementSystem.Services.ItemService;
import com.HospitalManagementSystem.dto.Item;

public class TestGetItemById {
	public static void main(String[] args) {
		ItemService itemService = new ItemService();
		Item item = itemService.getItemById(1);
		if(item!=null)
		{
			System.out.println("Item id is : " + item.getIid());
			System.out.println("Item name is : " + item.getName());
			System.out.println("Item cost is : " + item.getCost());
			System.out.println("Item quatity is : " + item.getQuantity());
		}
		else
		{
			System.out.println("Item not found!");
		}
	}
}
