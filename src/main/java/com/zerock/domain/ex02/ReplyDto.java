package com.zerock.domain.ex02;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ReplyDto {
	private int id;
	private int boardId; // board_id column과 매칭, 별칭(alias) 잘 쓸것 
	private String content;
	private LocalDateTime inserted;
}
