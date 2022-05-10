package com.zerock.controller.ex05;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zerock.controller.ex03.Customer;
import com.zerock.controller.ex03.Employee;

@Controller
@RequestMapping("ex09")
public class Ex09Controller {

	@RequestMapping("sub01")
	public void method01(String name, Model model) {
		// 1. request 파라미터 수집/ 가공
		System.out.println(name);
		// 3. model에 attribute 추가
		model.addAttribute("name", name);
		
		// 4. view forward: ex09/sub01.jsp
	}
	
	// /ex09/sub02?name=sunja
	@RequestMapping("sub02")
	public String method02(@ModelAttribute("name") String name) {

		return "ex09/sub01";
	}
	
	// /ex09/sub03?address=seoul&email=seoul@gmail.com
	@RequestMapping("sub03")
	public void method03(@ModelAttribute("address") String address, 
			             @ModelAttribute("email") String email) {
		
	}
	
	// /ex09/sub04?name=trump&age=40&address=newyork
	@RequestMapping("sub04")
	public void method04(@ModelAttribute("customer") Customer cus) {
		
	}
	
	// /ex09/sub05?name=trump&age=40&address=newyork	
	@RequestMapping("sub05")
	public String method05(@ModelAttribute Customer cus) {
		return "ex09/sub04";
	}

	// /ex09/sub06?name=trump&age=40&address=newyork
	@RequestMapping("sub06")
	public String method06(Customer cus) {
		return "ex09/sub04";
	}
	// request path : /ex09/sub07
	// query string : ?name=sunja&salary=50000&email=sunja@gmail.com
	
	// method07 작성
	// org.zerock.controller.ex03.Employee 객체가
	// 쿼리스트링으로 넘어온 파라미터값들을 세팅해서
	// model에 "employee"라는 이름의 attribute 로 추가되고
	// /ex09/sub07 뷰로 포워드 되도록
	
	@RequestMapping("sub07")
	public void method07(Employee emp) {

	}
}

















