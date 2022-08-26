package com.exe.springdi4;


public class ServiceConsumer {

	//생성자로 의존성 주입
	MessageService ms;
	TimeService ts;
	
	//기본생성자로 메소드 생성
	public ServiceConsumer() {}
	
	public ServiceConsumer(MessageService ms) {
		this.ms = ms;
	}
	
	//메소드로 의존성 주입
	public void setTimeService(TimeService ts) {
		this.ts = ts;
	}
	
	public void consumerService() {
		
		String message = ms.getMessage();
		System.out.println(message);
		
		String time = ts.getTimeString();
		System.out.println(time);
	}
	
}
