package com.exe.springdi3;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MessageService {

	public void messageService() {
		
		//BeanFactory 생성
		GenericXmlApplicationContext context =
				new GenericXmlApplicationContext("app-context.xml");
		
		//Bean 획득
		
		//MessageKr의 값이 들어가있음
		Message ms = (Message)context.getBean("message");
		ms.sayHello("배수지");
	}
	
}
