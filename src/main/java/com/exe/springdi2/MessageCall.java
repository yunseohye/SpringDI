package com.exe.springdi2;

public class MessageCall {

	public static void main(String[] args) {

		MessageKr ob1 = new MessageKr();
		ob1.sayHello("���γ�");
		
		MessageEn ob2 = new MessageEn();
		ob2.sayHello("inna");
		
		Message ms = null;
		
		ms = new MessageKr();
		ms.sayHello("���μ�");

		ms = new MessageEn();
		ms.sayHello("insun");
		
	}

}
