package com.zerock.service.ex02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zerock.controller.ex09.CustomerDto;
import com.zerock.controller.ex09.EmployeeDto;
import com.zerock.mapper.ex02.Ex02Mapper;

@Service
public class Ex04Service {

	@Autowired
	private Ex02Mapper mapper;
	
	public String getNameById(int id) {
		String name = mapper.selectNameById(id);
		
		return name;
	}

	public String getFisrtNameById(int id) {
		String firstName = mapper.selectFisrtNameById(id);
		
		return firstName;
	}

	public CustomerDto getCustomerInfoById(int id) {
		return mapper.selectCustomerById(id);
	}

	public EmployeeDto getEmployeeInfoById(int id) {
		return mapper.selectEmployeeById(id);
	}

	public boolean addCustomer(CustomerDto customer) {
		int count = mapper.insertCustomer(customer);
		return count == 1;
	}

	public boolean addEmployee(EmployeeDto employee) {
		int count = mapper.insertEmployee(employee);
		return count == 1;
	}
	
}
