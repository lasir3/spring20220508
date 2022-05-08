package lecture.c05core;

import lombok.Data;

@Data
public class MyServlet {
	private MyDao dao;
	
	public void doget() {
		dao.insert();
	}
}
