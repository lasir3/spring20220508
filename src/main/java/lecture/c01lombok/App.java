package lecture.c01lombok;

public class App {
	public static void main(String[] args) {
		JavaBeans1 o1 = new JavaBeans1();
		
		o1.setAge(33);
		o1.setName("sunja");
		
		System.out.println(o1.getAge());
		System.out.println(o1.getName());
		
		System.out.println(o1.toString());
		
		
		JavaBeans2 o2 = new JavaBeans2();
		
		o2.setId(3);
		o2.setModel("tesla");
		
		System.out.println(o2.getId());
		System.out.println(o2.getModel());
		System.out.println(o2.toString());
		
		
		JavaBeans3 o3 = new JavaBeans3();
		
		o3.setAddress("seoul");
		o3.setEmployeeId(1);
		
		System.out.println(o3);
		
		
		JavaBeans4 o4 = new JavaBeans4("jimin", 99);
		System.out.println(o4);
		
		JavaBeans4 o5 = new JavaBeans4();
		
	}
}
