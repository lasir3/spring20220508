package lecture.c06core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        String path = "lecture/c06core/context.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(path);

        Computer com = context.getBean(Computer.class);
        
        com.calc(); // 메모리를 읽습니다.
    }
}
