package com.zerock.mapper.ex02;

import org.apache.ibatis.annotations.Select;

import com.zerock.controller.ex09.CustomerDto;

public interface Ex02Mapper {
	
	@Select("SELECT CustomerName FROM Customers WHERE CustomerID = #{id}")
	String selectNameById(int id);

	@Select("SELECT FirstName FROM Employees WHERE EmployeeID = #{id}")
	String selectFisrtNameById(int id);

	@Select("SELECT CustomerName, Address FROM Customers WHERE CustomerId = #{id}")
	CustomerDto selectCustomerById(int id);

}
