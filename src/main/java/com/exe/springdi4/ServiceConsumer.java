package com.exe.springdi4;


public class ServiceConsumer {

	//�����ڷ� ������ ����
	MessageService ms;
	TimeService ts;
	
	/**�޼ҵ�� ������ ������ �ϱ� ���ؼ��� �⺻������ ������ �� �ʿ�*/
	public ServiceConsumer() {}
	
	/**�����ڷ� ������ ����*/
	public ServiceConsumer(MessageService ms) {
		this.ms = ms;
	}
	
	/**�޼ҵ�� ������ ����
	 * �޼ҵ�� ������ ������ �� ������ �⺻�����ڰ� �� �ʿ��ؼ� ������ ����
	 * �⺻�����ڷ� ��ü������ �� �Ŀ� �޼ҵ尡 ����Ǳ� ����
	 * 
	 * app-context.xml ���� �Ű������� �־���� �����*/
	public void setTimeService(TimeService ts) {
		this.ts = ts;
	}
	
	public void consumerService() {
		
//		GenericXmlApplicationContext context = 
//		new GenericXmlApplicationContext("app-context.xml");
//
//		MessageService ms = (MessageService)context.getBean("messageService");		
		
		String message = ms.getMessage();
		System.out.println(message);
		
		String time = ts.getTimeString();
		System.out.println(time);
	}
	
}
