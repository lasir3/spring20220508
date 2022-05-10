package com.zerock.controller.ex05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zerock.controller.ex03.Customer;
import com.zerock.controller.ex03.Employee;

@Controller
@RequestMapping("ex08")
public class Ex08Controller {
	
	@RequestMapping("sub01")
	public String method01(HttpServletRequest req) {
		
		req.setAttribute("address", "new york");
		// prefix : /WEB-INF/views/
		// suffix : .jsp
		
		// full view name : /WEB-INF/views/ex08/sub01.jsp
		return "ex08/sub01";
	}
	
	@RequestMapping("sub02")
	public String method02(Model model) {
		
		model.addAttribute("address", "seoul");
		return "ex08/sub01";
	}
	
	@RequestMapping("sub03")
	public String method03(Model model) {
		
		model.addAttribute("myName", "trump");
		model.addAttribute("myAge", 75);
		return "ex08/sub03";
	}
	
	// prefix : /WEB-INF/views/
	// suffix : .jsp
	// 요청경로: /ex08/sub04
	// full view name : /WEB-INF/views/ex08/sub04.jsp
	@RequestMapping("sub04")
	public void method04(Model model) {
		
		model.addAttribute("foods", new String[] {"apple", "milk", "coffee"});
	}
	
	@RequestMapping("sub05")
	public void method05(Model model) {
		List<String> list = new ArrayList<>();
		list.add("superman");
		list.add("batman");
		list.add("aquaman");
		
		model.addAttribute("heroList", list);
	}
	
	@RequestMapping("sub06")
	public void method06(Model model) {
		
		Map<String, String> map = new HashMap<>();
		map.put("name", "jin");
		map.put("song",  "butter");
		map.put("group", "bts");
		
		model.addAttribute("desc", map);
	}
	
	@RequestMapping("sub07")
	public void method07(Model model) {
		
		Customer cus = new Customer();
		cus.setAddress("seoul");
		cus.setAge(30);
		cus.setName("donald");
		
		model.addAttribute("customer", cus);
	}
	
	@RequestMapping("sub08")
	public void method08(Model model) {
		Employee emp = new Employee();
		// email, name, salary 세팅
		
		// jsp와 이 메소드를 완성해서 위에 세팅한 email, name, salary 출력되도록
		
		emp.setEmail("donald@gmail.com");		
		emp.setName("donald");
		emp.setSalary(1000);
		
		model.addAttribute("employee", emp);
	}
	
	@RequestMapping("sub09")
	public String method09(Model model) {
		Employee emp = new Employee();
		emp.setEmail("korea@daum.net");
		emp.setName("sunja");
		emp.setSalary(80000);
		
//		model.addAttribute("employee", emp);
		model.addAttribute(emp); // attribute이름이 클래스의 이름으로 결정(단, lowerCamelCase)
		
		return "ex08/sub08";
	}
	
	@RequestMapping("sub10")
	public String method10(Model model) {
		
		// model.addAttribute(Object)를 사용해서
		// sub07.jsp에서 고객의 정보가 출력되도록 코드를 완성
		Customer cus = new Customer();
		cus.setName("trump");
		cus.setAge(75);
		cus.setAddress("new york");
		
		model.addAttribute(cus);
		
		return "ex08/sub07";
	}
	
	@RequestMapping("sub11")
	public void method11(Model model) {
		List<String> list = new ArrayList<>();
		list.add("wanda");
		list.add("doctor");
		list.add("wong");
		
		model.addAttribute("arrayList", list);
	}
	
	@RequestMapping("sub12")
	public void method12() {
		// 1. request 파라미터 수집/가공
		// 2. business 로직처리
		// 3. add attribute
		// 4. forward / redirect
	}
}
