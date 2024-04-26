package com.HospitalManagementSystem.Services;

import java.util.List;

import com.HospitalManagementSystem.dao.Imp.ItemDaoImp;
import com.HospitalManagementSystem.dto.Item;

public class ItemService {
	public void saveItem(int mid, Item item) {
		ItemDaoImp itemDaoImp = new ItemDaoImp();
		Item item1 = itemDaoImp.saveItem(mid, item);
		if (item1 != null) {
			System.out.println("Item Saved!");
		} else {
			System.out.println("Item Not Saved!");
		}
	}

	public Item getItemById(int iid) {
		ItemDaoImp itemDaoImp = new ItemDaoImp();
		Item item = itemDaoImp.getItemById(iid);
		if (item != null) {
			return item;
		} else {
			return null;
		}
	}

	public List<Item> getAllItems() {
		ItemDaoImp itemDaoImp = new ItemDaoImp();
		List<Item> item = itemDaoImp.getAllItems();
		if (item.size()>0) {
			return item;
		} else {
			return null;
		}
	}

	public void deleteItemById(int iid) {
		ItemDaoImp itemDaoImp = new ItemDaoImp();
		boolean flag = itemDaoImp.deleteItemById(iid);
		if (flag) {
			System.out.println("Item Deleted!");
		} else {
			System.out.println("Item Not Deleted!");
		}
	}
	}

