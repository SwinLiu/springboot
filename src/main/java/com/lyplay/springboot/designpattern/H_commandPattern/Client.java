package com.lyplay.springboot.designpattern.H_commandPattern;

public class Client {

	public static void main(String[] args) {
		// 首先声明调用者
		Invoker invoker = new Invoker();
		// 定义接受者
		Receiver receiver = new ConcreteReceiver1();
		//定义一个发送给接受者的命令
		Command command = new ConcreteCommand1(receiver);
		//把命令交给执行者去执行
		invoker.setCommand(command);
		
		invoker.action();
		
	}

}
