package com.HospitalManagementSystem.Control;

import com.HospitalManagementSystem.Services.MedOrderService;

public class TestDeleteMedOrderById {
	public static void main(String[] args) {
		MedOrderService medOrderService = new MedOrderService();
		medOrderService.deleteMedOrderById(1);
	}
}
