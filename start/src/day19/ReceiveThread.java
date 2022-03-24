package day19;

import java.net.*;

public class ReceiveThread extends Thread {
	Jjokji main;
	public ReceiveThread(Jjokji main) {
		this.main = main;
	}
	
	@Override
	public void run() {
		//받아야 할 쪽지가 있는지 반복해서 확인하는 작업이 되어야 한다.
		try {
			while(true) {
				//할일
				//쪽지 받기
				//도착한 쪽지는 패킷으로 도착한다.
				//그러므로 반드시 패킷을 준비해서 받아야한다.
				byte[] buff = new byte[10240];
				DatagramPacket pack = new DatagramPacket(buff, 10240);
				
				main.rSocket.receive(pack);
				System.out.println("### 쪽지 도착 ###");
				
				//receive() 역시 Blocking 함수이다. (패킷이 도착했을 때 실행되는 함수)
				//도착한 패킷을 대화상자를 이용해서 출력한다.
				receiveProc(pack);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//쪽지를 받으면 받은 쪽지를 처리해주는 함수
	public void receiveProc(DatagramPacket pack) {
		//할일
		//1. 포장을 뜯어서 내용물을 확인한다.
		byte[] buff = pack.getData();
		String msg = new String(buff, 0, buff.length);
		
		//보낸 사람 정보 확인
		InetAddress addr = pack.getAddress();
		String ip = addr.getHostAddress();
		
		//아이피에 해당하는 보낸 사람 이름 꺼내오고
		String name = main.ipToName.getProperty(ip);
		System.out.println("*******" + ip);
		ReceiveDlg dlg = new ReceiveDlg(main);
		dlg.field.setText(name);
		dlg.area.setText(msg);
	}

}
