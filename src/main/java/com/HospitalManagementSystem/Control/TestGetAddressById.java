package com.HospitalManagementSystem.Control;

import com.HospitalManagementSystem.Services.AddressService;
import com.HospitalManagementSystem.dto.Address;

public class TestGetAddressById {
	public static void main(String[] args) {
		AddressService addressService = new AddressService();
		Address address = addressService.getAddressById(1);
		if(address!=null)
		{
			System.out.println("The address id is : "+address.getAid());
			System.out.println("The address Street is : "+address.getStreet());
			System.out.println("The address State is : "+address.getState());
			System.out.println("The address country is : "+address.getCountry());
			System.out.println("The address pin is : "+address.getPin());
		}
		else
		{
			System.out.println("Address Not Found!");
		}
	}
}
