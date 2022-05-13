package com.zerock.service.ex03;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zerock.domain.ex02.BoardDto;
import com.zerock.mapper.ex03.Ex03Mapper;
import com.zerock.mapper.ex03.Ex04Mapper;

@Service
public class Ex05Service {

	@Autowired
	private Ex03Mapper mapper;
	
	@Autowired
	private Ex04Mapper replyMapper;
	
	public String getCustomerNameById(int id) {
		return mapper.selectCustomerNameById(id);
	}

	public String getEmployeeFirstNameById(int id) {
		return mapper.selectEmployeeNameById(id);
	}

	public List<BoardDto> listBoard() {
		return mapper.selectBoard();
	}

	public BoardDto getBoard(int id) {
		return mapper.getBoard(id);
	}

	public boolean updateBoard(BoardDto board) {
		int cnt = mapper.updateBoard(board);
		return cnt == 1;
	}

	@Transactional // 한번에 처리해야되는 항목
	public boolean removeBoardById(int id) {
		// 댓글 지우기
		replyMapper.deleteReplyByBoard(id);
		
		// for transaction
		// exception
//		int i = 3 / 0;
		
		// 게시물 지우기
		int cnt = mapper.deleteBoard(id);
		
		return cnt == 1;
	}

	public boolean addBoard(BoardDto board) {
		board.setInserted(LocalDateTime.now());
		
		int cnt = mapper.insertBoard(board);
		
		return cnt == 1;
	}


}
