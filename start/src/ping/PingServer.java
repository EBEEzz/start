package ping;

import java.util.*;

public class PingServer {
	private boolean bool = true;
	private PingThread ping;
//	private Scanner sc;
	public PingServer() {
		ping = new PingThread();
		
		Scanner sc = new Scanner(System.in);
		
		loop:
		while(true) {
			// 메세지 출력
			System.out.println();
			System.out.println("~ WELCOME! Ping Server ~\n"
					+ "\n \"start\" : 서버 개시\n"
					+ " \"quit\"  : 서버 종료\n"
					+ "\n~ 명령을 입력하세요. ~");
			String str = sc.nextLine();
			
			// 2-1
			switch(str) {
			case "start":
				if(bool) {
					ping.start();
					bool = false;
					try {
						Thread.sleep(200);
					} catch(Exception e) {}
					break;
				}
				// 2-2
				System.out.println("\n!!! 이미 서버가 실행중입니다 !!!");
				break;
			case "quit":
				ping.setStart(false);
				try {
					ping.allClose();
				} catch (Exception e) {}
				break loop;
			}
		}
	}

	public static void main(String[] args) {
		new PingServer();
	}

}