package com.zerock.service.ex03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zerock.mapper.ex03.Ex03Mapper;

@Service
public class Ex05Service {

	@Autowired
	private Ex03Mapper mapper;
	
	public String getCustomerNameById(int id) {
		return mapper.selectCustomerNameById(id);
	}

	public String getEmployeeFirstNameById(int id) {
		return mapper.selectEmployeeNameById(id);
	}

}
