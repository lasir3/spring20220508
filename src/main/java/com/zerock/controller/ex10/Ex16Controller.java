package com.zerock.controller.ex10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zerock.domain.ex02.ReplyDto;
import com.zerock.service.ex03.Ex06Service;

@Controller
@RequestMapping("ex16")
public class Ex16Controller {
	
	@Autowired
	private Ex06Service service;
	
	@PostMapping("reply/add")
	public String addReply(ReplyDto reply) {
		boolean success = service.addReply(reply);
		
		return "redirect:/ex15/board/" + reply.getBoardId();
	}
	
	@PostMapping("reply/remove")
	public String removeReply(ReplyDto reply) {
		boolean success = service.removeReplyById(reply.getId());
		
		return "redirect:/ex15/board/" + reply.getBoardId();
	}
	
	@PostMapping("reply/modify")
	public String modifyReply(ReplyDto reply) {
		boolean success =service.modifyReply(reply);
		
		return "redirect:/ex15/board/" + reply.getBoardId();
	}
}
