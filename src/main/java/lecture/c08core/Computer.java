package lecture.c08core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component
@ToString
public class Computer {
	
	@Setter(onMethod_ = @Autowired)
	private Memory memory;
	
//	@Autowired
//	public void setMemory(Memory memory) {
//		this.memory = memory;
//	}
}
