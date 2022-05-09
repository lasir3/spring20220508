package com.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex07")
public class Ex07Controller {

	@RequestMapping("sub01")
	public String method01() {
		// 1. request 파라미터 수집/가공
		// 2. business 로직 처리
		// 3. add attribute
		// 4. forward/redirect
		
		return "redirect:https://www.naver.com";
	}
	
	@RequestMapping("sub03")
	public String method02() {
		// /ex07/sub03
		// /ex06/sub01로 redirection
		
		return "redirect:/ex06/sub01";
	}
	
	@RequestMapping("sub04")
	public String method03() {
		// /ex06/sub05로 리디렉션하는 코드 작성
		
		return "redirect:/ex06/sub05";
	}
}
