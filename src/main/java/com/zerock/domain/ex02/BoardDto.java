package com.zerock.domain.ex02;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class BoardDto {

	private int id;
	private String title;
	private String body;
	private LocalDateTime inserted;
	
}
