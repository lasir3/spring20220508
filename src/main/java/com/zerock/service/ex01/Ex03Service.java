package com.zerock.service.ex01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zerock.controller.ex03.Customer;
import com.zerock.mapper.ex01.Ex01Mapper;

@Service
public class Ex03Service {
	
	@Autowired
	private Ex01Mapper mapper;
	
	public int getNumber() {
		int number = mapper.selectNumber();
		
		return number;
	}
}
