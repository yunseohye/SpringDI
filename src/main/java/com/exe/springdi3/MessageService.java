package com.exe.springdi3;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MessageService {

	public void messageService() {
		
		//BeanFactory ����
		GenericXmlApplicationContext context =
				new GenericXmlApplicationContext("app-context.xml");
		
		//Bean ȹ��
		
		//MessageKr�� ���� ������
		Message ms = (Message)context.getBean("message");
		ms.sayHello("�����");
	}
	
}
