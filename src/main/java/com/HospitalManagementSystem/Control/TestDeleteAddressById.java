package com.HospitalManagementSystem.Control;

import com.HospitalManagementSystem.Services.AddressService;

public class TestDeleteAddressById {
	public static void main(String[] args) {
		AddressService addressService = new AddressService();
		addressService.deleteAddressById(1);
	}
}
