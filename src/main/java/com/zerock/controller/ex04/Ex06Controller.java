package com.zerock.controller.ex04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex06")
public class Ex06Controller {
	
	@RequestMapping("sub01")
	public String method01() {
		
		
		// prefix : /WEB-INF/views/
		// suffix : .jsp
		
		// full view name : /WEB-INF/views/myview01.jsp
		return "myview01"; 
	}
	
	@RequestMapping("sub02")
	public String method02() {
		return "myview02";
	}
	
	@RequestMapping("sub03")
	public String method03() {
		
		// prefix : /WEB-INF/views/
		// suffix : .jsp
		
		// full view name : /WEB-INF/views/ex06/myview03.jsp
		return "ex06/myview03";
	}
	
	@RequestMapping("sub04")
	public String method04() {
		// 요청 경로와 view(jsp)의 경로가 같은 경우
		// null로 리턴 가능
		
		// 요청경로: /ex06/sub04
		// 뷰이름: /WEB-INF/views/ex06/sub04.jsp
		return null;
	}
	
	@RequestMapping("sub05")
	public void method05() {
		// 요청 경로와 view(jsp)의 경로가 같은 경우
		// null로 리턴 가능
		
		// 요청경로: /ex06/sub05
		// 뷰이름: /WEB-INF/views/ex06/sub05.jsp
	}
}
