package com.zerock.controller.ex01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Ex01Controller {

	@RequestMapping("/ex01/sub01")
	public void method01() {
		System.out.println("메소드 01 일함");
	}
	
	@RequestMapping("/ex01/sub02")
	public void method02() {
		System.out.println("메소드 02 일함");
	}
	
}
