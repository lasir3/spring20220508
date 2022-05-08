package lecture.c10core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		String path = "lecture/c10core/context.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		
		Computer com = context.getBean(Computer.class);
		System.out.println(com);
		
	}
}
