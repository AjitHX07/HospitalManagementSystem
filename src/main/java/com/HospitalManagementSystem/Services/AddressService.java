package com.HospitalManagementSystem.Services;

import java.util.List;

import com.HospitalManagementSystem.dao.Imp.AddressDaoImp;
import com.HospitalManagementSystem.dto.Address;

public class AddressService {
	public void saveAddress(int bid, Address address) {
		AddressDaoImp addressDaoImp = new AddressDaoImp();
		Address address1 = addressDaoImp.saveAddress(bid, address);
		if (address1 != null) {
			System.out.println("Address Saved!");
		} else {
			System.out.println("Address Not Saved!");
		}
	}

	public Address getAddressById(int aid) {
		AddressDaoImp addressDaoImp = new AddressDaoImp();
		Address address = addressDaoImp.getAddressById(aid);
		if (address != null) {
			return address;
		} else {
			return null;
		}
	}

	public void deleteAddressById(int aid) {
		AddressDaoImp addressDaoImp = new AddressDaoImp();
		boolean flag = addressDaoImp.deleteAddressById(aid);
		if (flag) {
			System.out.println("Address Deleted!");
		} else {
			System.out.println("Address Not Deleted!");
		}
	}

	public List<Address> getAllAddress() {
		AddressDaoImp addressDaoImp = new AddressDaoImp();
		List<Address> addresses = addressDaoImp.getAllAddress();
		if (addresses.size() > 0) {
			return addresses;
		} else {
			return null;
		}
	}
}
