package day19;

import java.awt.event.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.net.*;

public class WriteEvt implements ActionListener {
	MsgWrite main;
	
	public WriteEvt(MsgWrite main) {
		this.main = main;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//어떤 버튼이 눌렸는지 먼저 알아낸다.
		String str = e.getActionCommand();		
		if(str.equals("다시작성")) {
			main.area.setText("");
		} else if(str.equals("보내기")) {
			sendProc();
		}
	}
	
	//쪽지 보내기 전담 처리함수
	public void sendProc() {
		//할일
		//보낼 내용을 알아내고
		String msg = main.area.getText();
		//바이트배열로 변환하고
		byte[] buff = msg.getBytes();
		
		//상대방 아이피를 알아내고
		//이름 읽어오고
		String name = main.field.getText();
		String ip = (String) main.main.nameToIp.get(name);
		
		InetAddress inet = null;
		try {
			inet = InetAddress.getByName(ip);
		} catch(Exception e) {
			e.printStackTrace();
		}
		DatagramPacket pack = null;
		try {
			pack = new DatagramPacket(buff, buff.length, inet, 3208);
			//이걸로 패킷이 만들어졌고 이제 만들어진 패킷을 네트워크에 흘려보내면 된다.
			
			main.main.sSocket.send(pack);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		//이 작업이 완료되면 전송이 완료됐으므로 현재 작업창을 닫고 메인창을 띄워준다.
		main.frame.dispose();
		main.main.frame.setVisible(true);
	}

}
