package com.HospitalManagementSystem.Services;

import java.util.List;

import com.HospitalManagementSystem.dao.Imp.MedOrderDaoImp;
import com.HospitalManagementSystem.dto.MedOrder;

public class MedOrderService {
	public void saveMedOrder(int eid, MedOrder medOrder) {
		MedOrderDaoImp medOrderDaoImp = new MedOrderDaoImp();
		MedOrder medOrder1 = medOrderDaoImp.saveMedOrder(eid, medOrder);
		if (medOrder1 != null) {
			System.out.println("MedOrder Saved!");
		} else {
			System.out.println("MedOrder Not Saved!");
		}
	}

	public MedOrder getMedOrderById(int mid) {
		MedOrderDaoImp medOrderDaoImp = new MedOrderDaoImp();
		MedOrder medOrder1 = medOrderDaoImp.getMedOrderById(mid);
		if (medOrder1 != null) {
			return medOrder1;
		} else {
			return null;
		}
	}

	public List<MedOrder> getAllMedOrders() {
		MedOrderDaoImp medOrderDaoImp = new MedOrderDaoImp();
		List<MedOrder> medOrder = medOrderDaoImp.getAllMedOrders();
		if (medOrder.size() > 0) {
			return medOrder;
		} else {
			return null;
		}
	}

	public void deleteMedOrderById(int mid) {
		MedOrderDaoImp medOrderDaoImp = new MedOrderDaoImp();
		boolean flag = medOrderDaoImp.deleteMedOrderById(mid);
		if (flag) {
			System.out.println("MedOrder Deleted!");
		} else {
			System.out.println("MedOrder Not Deleted!");
		}
	}

	public MedOrder getMedOrderByDoctorName(String name) {
		MedOrderDaoImp medOrderDaoImp = new MedOrderDaoImp();
		MedOrder medOrder = medOrderDaoImp.getMedOrderByDoctorName(name);
		if (medOrder != null) {
			return medOrder;
		} else {
			return null;
		}
	}

	public MedOrder getMedOrderByDate(String date) {
		MedOrderDaoImp medOrderDaoImp = new MedOrderDaoImp();
		MedOrder medOrder = medOrderDaoImp.getMedOrderByDate(date);
		if (medOrder != null) {
			return medOrder;
		} else {
			return null;
		}
	}
}
