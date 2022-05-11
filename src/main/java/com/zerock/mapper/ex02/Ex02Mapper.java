package com.zerock.mapper.ex02;

import org.apache.ibatis.annotations.Select;

public interface Ex02Mapper {
	
	@Select("SELECT CustomerName FROM Customers WHERE CustomerID = #{id}")
	String selectNameById(int id);

	@Select("SELECT FirstName FROM Employees WHERE EmployeeID = #{id}")
	String selectFisrtNameById(int id);

}
