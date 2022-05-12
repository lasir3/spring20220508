package com.zerock.mapper.ex02;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.zerock.domain.ex01.CustomerDto;
import com.zerock.domain.ex01.EmployeeDto;

public interface Ex02Mapper {
	
	@Select("SELECT CustomerName FROM Customers WHERE CustomerID = #{id}")
	String selectNameById(int id);

	@Select("SELECT FirstName FROM Employees WHERE EmployeeID = #{id}")
	String selectFisrtNameById(int id);

	// 테이블의 필드명이 자바빈의 변수명과 다를 수 있다
	// -->일치 시켜야한다
	@Select("SELECT CustomerName "
			+ "Name, "
			+ "Address, "
			+ "City, "
			+ "Country "
			+ "FROM Customers WHERE CustomerId = #{id}") 
	CustomerDto selectCustomerById(int id);

	@Select("SELECT FirstName, LastName, BirthDate FROM Employees WHERE EmployeeID = #{id}")
	EmployeeDto selectEmployeeById(int id);

	@Insert("INSERT INTO Customers "
			+ " (CustomerName, ContactName, City, Country, Address, PostalCode) "
			+ " VALUES (#{customerName}, #{contactName}, #{city}, #{country}, #{address}, #{postalCode})")
	int insertCustomer(CustomerDto customer); // 실행 결과값을 int로 return

	@Insert("INSERT INTO Employees "
			+ " (LastName, FirstName, BirthDate, Photo, Notes) "
			+ " VALUES (#{lastName}, #{firstName}, #{birthDate}, #{photo}, #{notes})")
	int insertEmployee(EmployeeDto employee);
	
	@Select("SELECT EmployeeID id, FirstName, LastName, Photo, Notes, BirthDate "
			+ "FROM Employees ORDER BY EmployeeID")
	List<EmployeeDto> listEmployee();
	
	@Select("SELECT CustomerID id, CustomerName, ContactName, Address, City, PostalCode, Country "
			+ "FROM Customers ORDER BY CustomerID")
	List<CustomerDto> listCustomer();

	
	@Select("SELECT CustomerID id, "
			+ "CustomerName, "
			+ "ContactName, "
			+ "Address, "
			+ "City, "
			+ "PostalCode, "
			+ "Country "
			+ "FROM Customers "
			+ "LIMIT #{from}, #{row}")
	List<CustomerDto> listCustomerPage(@Param("from") int from, @Param("row") int row);
	
	@Select("SELECT Count(CustomerId) FROM Customers ")
	int countCustomers();

}
