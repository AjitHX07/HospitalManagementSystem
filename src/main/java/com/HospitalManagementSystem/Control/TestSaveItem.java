package com.HospitalManagementSystem.Control;

import com.HospitalManagementSystem.Services.ItemService;
import com.HospitalManagementSystem.dto.Item;

public class TestSaveItem {
	public static void main(String[] args) {
		Item item = new Item();
		item.setName("Paracetamol");
		item.setQuantity(2);
		item.setCost(10);
		ItemService itemService = new ItemService();
		itemService.saveItem(2, item);

	}
}
