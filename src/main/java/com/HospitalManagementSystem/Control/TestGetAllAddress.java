package com.HospitalManagementSystem.Control;

import java.util.List;

import com.HospitalManagementSystem.Services.AddressService;
import com.HospitalManagementSystem.dto.Address;

public class TestGetAllAddress {
	public static void main(String[] args) {
		AddressService addressService = new AddressService();
		List<Address> addresses = addressService.getAllAddress();
		if (addresses != null) {
			for (Address address : addresses) {
				System.out.println("The address id is : "+address.getAid());
				System.out.println("The address Street is : "+address.getStreet());
				System.out.println("The address State is : "+address.getState());
				System.out.println("The address country is : "+address.getCountry());
				System.out.println("The address pin is : "+address.getPin());
			}
		}
		else
		{
			System.out.println("Address Not Found");
		}
	}
}
