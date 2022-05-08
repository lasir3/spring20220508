package lecture.c04core;

public class Servlet {
	private Dao dao;
	
	public void doGet() { 
		dao.select();
	}
}
