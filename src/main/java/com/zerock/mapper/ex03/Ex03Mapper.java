package com.zerock.mapper.ex03;

import java.util.List;

import com.zerock.domain.ex02.BoardDto;

public interface Ex03Mapper {

	String selectCustomerNameById(int id);

	String selectEmployeeNameById(int id);

	List<BoardDto> selectBoard();

	BoardDto getBoard(int id);

	int updateBoard(BoardDto board);

	int deleteBoard(int id);

	int insertBoard(BoardDto board);

}