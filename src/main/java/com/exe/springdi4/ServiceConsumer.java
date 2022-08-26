package com.exe.springdi4;


public class ServiceConsumer {

	//�����ڷ� ������ ����
	MessageService ms;
	TimeService ts;
	
	//�⺻�����ڷ� �޼ҵ� ����
	public ServiceConsumer() {}
	
	public ServiceConsumer(MessageService ms) {
		this.ms = ms;
	}
	
	//�޼ҵ�� ������ ����
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
