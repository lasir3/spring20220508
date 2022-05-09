package com.zerock.controller.ex01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex02")
public class Ex02Controller {
	
	@RequestMapping("sub01")
	public void method01() {
		System.out.println("/ex02/sub01 일함");
	}
	
	@RequestMapping("sub02")
	public void method02() {
		System.out.println("/ex02/sub02 일함");
	}
	
	@RequestMapping(value= "sub03")
	public void method03() {
		System.out.println("/ex02/sub03 일함");
	}
	
	@RequestMapping({"sub04", "sub05"})
	public void method04() {
		System.out.println("/ex02/sub04, /ex02/sub05 일함");
	}
	
	@RequestMapping(value= {"sub06", "sub07"})
	public void method05() {
		System.out.println("/ex02/sub06, /ex02/sub07 일함");
	}
	
	@RequestMapping(path = {"sub08"})
	public void method06() {
		System.out.println("/ex02/sub08 일함");
	}
	
	@RequestMapping(path = {"sub09", "sub10"}) 
	public void method07() {
		System.out.println("/ex02/sub09 일함, /ex02/sub10 일함");
	}
	
}
