package lecture.c08core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		String path = "lecture/c08core/context.xml";
		
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		
		Car car = context.getBean(Car.class);
		Engine engine = context.getBean(Engine.class);
		Computer com = context.getBean(Computer.class);
		
		System.out.println(car);
		System.out.println(engine);
		System.out.println(com);
		
		car.go();
	}
}
