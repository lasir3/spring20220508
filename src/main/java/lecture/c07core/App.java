package lecture.c07core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		String path = "lecture/c07core/context.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		
		Car car = context.getBean(Car.class);
		car.move();
	}
}
