package com.lyplay.springboot.designpattern.E_proxyPattern;

public class Proxy implements Subject {

	private Subject subject = null;
	
	public Proxy(Subject subject) {
		this.subject = subject;
	}
	
	@Override
	public void request() {
		this.before();
		this.subject.request();
		this.after();
	}
	
	private void before(){
		// do something
	}
	
	private void after(){
		// do something
	}

}
