package lecture.c10core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Computer {
	
	@Autowired
	private SSD ssd;

}
