package com.lyplay.springboot.designpattern.H_commandPattern;

public abstract class Command {
	
	public abstract void execute();
	
}

class ConcreteCommand1 extends Command{

	private Receiver receiver;
	
	public ConcreteCommand1(Receiver _receiver) {
		this.receiver = _receiver;
	}
	
	@Override
	public void execute() {
		this.receiver.doSomething();
	}
}

class ConcreteCommand2 extends Command{

	private Receiver receiver;
	
	public ConcreteCommand2(Receiver _receiver) {
		this.receiver = _receiver;
	}
	
	@Override
	public void execute() {
		this.receiver.doSomething();
	}
}