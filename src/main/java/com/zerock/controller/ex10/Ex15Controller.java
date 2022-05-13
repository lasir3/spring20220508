package com.zerock.controller.ex10;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zerock.domain.ex02.BoardDto;
import com.zerock.service.ex03.Ex05Service;

@Controller
@RequestMapping("ex15")
public class Ex15Controller {
	
	@Autowired
	private Ex05Service service;
	
	@RequestMapping("sub01")
	public String method01(int id, Model model) {
		String name = service.getCustomerNameById(id);
		
		model.addAttribute("name", name);
		
		return "/ex14/sub01";
	}
	
	@RequestMapping("sub02")
	public String method02(int id, Model model) {
		String name = service.getEmployeeFirstNameById(id);
		model.addAttribute("firstName", name);
		
		return "ex14/sub02";
	}
	
	
	@GetMapping("board/list")
	public void listBoard(Model model) {
		List<BoardDto> list = service.listBoard();
		
		model.addAttribute("boardList", list);
		
		System.out.println(list.size());
	}
	
	@GetMapping("board/{id}") // 책 366쪽
	public String getBoard(@PathVariable("id") int id, Model model) {
		System.out.println(id);
		
		// 서비스일 시켜서 id에 해당하는 게시물 select
		BoardDto dto = service.getBoard(id);
		// 모델에 넣고
		model.addAttribute("board", dto);
		
		// /WEB-INF/views/board/get.jsp로 포워드
		return "/ex15/board/get";
	}
	
	@PostMapping("board/modify")
	public String modifyBoard(BoardDto board) {
		boolean success = service.updateBoard(board);
		
		if (success) {
			
		} else {
			
		}
		
		return "redirect:/ex15/board/" + board.getId();
	}
	
	@PostMapping("board/remove")
	public String removeBaord(int id) {
		boolean success = service.removeBoardById(id);
		
		if (success) {
			
		} else {
			
		}
		
		return "redirect:/ex15/board/list";
	}
	
	@GetMapping("board/wirte")
	public void writeBoard() {
		
	}
	
	@PostMapping("board/write")
	public String writeBoardProcess(BoardDto board) {
		boolean success = service.addBaord(board);
		
		if (success) {
			
		} else {
			
		}
		
//		int id = 1;
		
		return "redirect:/ex15/board" + board.getId();
	}
}
