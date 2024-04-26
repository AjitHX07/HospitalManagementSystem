package com.HospitalManagementSystem.dao;

import java.util.List;

import com.HospitalManagementSystem.dto.Address;

public interface Addressdao {
	public Address saveAddress(int bid, Address address);

	public Address getAddressById(int aid);

	public boolean deleteAddressById(int aid);

	//public Address updateAddressById(int aid);

	public List<Address> getAllAddress();
}
