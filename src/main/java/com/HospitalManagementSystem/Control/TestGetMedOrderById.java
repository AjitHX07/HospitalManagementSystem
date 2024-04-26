package com.HospitalManagementSystem.Control;

import com.HospitalManagementSystem.Services.MedOrderService;
import com.HospitalManagementSystem.dto.MedOrder;

public class TestGetMedOrderById {
	public static void main(String[] args) {
		MedOrderService medOrderService = new MedOrderService();
		MedOrder medOrder = medOrderService.getMedOrderById(2);
		if(medOrder!=null)
		{
			System.out.println("MedOrder id is : " +medOrder.getMid() );
			System.out.println("MedOrder dname is : " +medOrder.getDname());
			System.out.println("MedOrder orderDate is : " +medOrder.getOrderdate());
		}
		else
		{
			System.out.println("MedOrder not found!");
		}
	}
}
