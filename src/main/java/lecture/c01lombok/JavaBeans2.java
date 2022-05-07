package lecture.c01lombok;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class JavaBeans2 {
	private String model;
	private int id;
}
