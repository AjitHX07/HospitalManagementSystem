package com.HospitalManagementSystem.Control;

import com.HospitalManagementSystem.Services.AddressService;
import com.HospitalManagementSystem.dto.Address;

public class TestSaveAddress {
public static void main(String[] args) {
	Address address = new Address();
	address.setStreet("trivandrum");
	address.setState("Kerala");
	address.setCountry("India");
	address.setPin(12345);
	AddressService addressService = new AddressService();
	addressService.saveAddress(2, address);
}
}
