package com.zerock.service.ex03;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zerock.domain.ex02.BoardDto;
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

	public boolean removeBoardById(int id) {
		int cnt = mapper.deleteBoard(id);
		
		return cnt == 1;
	}


}
