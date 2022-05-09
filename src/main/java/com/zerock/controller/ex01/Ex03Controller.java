package com.zerock.controller.ex01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex03")
public class Ex03Controller {
	
	@RequestMapping("sub01")
	public void method01() {
		System.out.println("/ex03/sub01 일함");
	}
	
	@RequestMapping(value = "sub01", params = "name")
	public void method02() {
		System.out.println("/ex03/sub01 경로, name 파라미터 있음");
	}
	
	@RequestMapping(value = "sub01", params = {"name", "age"})
	public void method03() {
		System.out.println("같은경로, name, age 파라미터 있음");
	}
}
