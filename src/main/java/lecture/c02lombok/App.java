package lecture.c02lombok;

import lombok.extern.log4j.Log4j;

@Log4j
public class App {
	public static void main(String[] args) {
		System.out.println("어떤 메세지 출력...");
		log.debug("디버그 용 메시지 출력...");
		log.info("인포 용 메시지 출력...");
		log.warn("워닝 용 메시지 출력...");
		log.error("에러 용 메시지 출력...");
		log.fatal("치명적에러 용 메시지 출력...");
	}
}
