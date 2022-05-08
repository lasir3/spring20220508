package lecture.c06core;

import lombok.Setter;

public class Computer {

    @Setter
    private Memory memory;

    public void calc() {
        memory.read();
    }
}
