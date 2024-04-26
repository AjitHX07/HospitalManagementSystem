package com.HospitalManagementSystem.Control;

import com.HospitalManagementSystem.Services.MedOrderService;
import com.HospitalManagementSystem.dto.MedOrder;

public class TestSaveMedOrder {
public static void main(String[] args) {
	MedOrder medOrder = new MedOrder();
	medOrder.setDname("lolan");
	medOrder.setOrderdate("12-jul-2023");
	MedOrderService medOrderService = new MedOrderService();
	medOrderService.saveMedOrder(2, medOrder);
}
}
