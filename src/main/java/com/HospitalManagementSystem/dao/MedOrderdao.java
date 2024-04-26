package com.HospitalManagementSystem.dao;

import java.util.List;

import com.HospitalManagementSystem.dto.MedOrder;

public interface MedOrderdao {
	public MedOrder saveMedOrder(int eid, MedOrder medOrder);

	public MedOrder getMedOrderById(int mid);

	public List<MedOrder> getAllMedOrders();

	public boolean deleteMedOrderById(int mid);

	public MedOrder getMedOrderByDoctorName(String name);

	public MedOrder getMedOrderByDate(String date);

	// public MedOrder updateMedOrderById(int mid);
}
