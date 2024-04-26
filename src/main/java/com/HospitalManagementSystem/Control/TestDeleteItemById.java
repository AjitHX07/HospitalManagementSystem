package com.HospitalManagementSystem.Control;

import com.HospitalManagementSystem.Services.ItemService;

public class TestDeleteItemById {
	public static void main(String[] args) {
		ItemService itemService = new ItemService();
		itemService.deleteItemById(1);
	}
}
