package com.zerock.domain.ex01;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.Data;

@Data
public class EmployeeDto {
	private int id;
	private String firstName;
	private String lastName;
	
//	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate birthDate;
	private String photo;
	private String notes;
}


