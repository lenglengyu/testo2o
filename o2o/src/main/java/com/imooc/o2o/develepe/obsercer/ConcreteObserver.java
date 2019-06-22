package com.imooc.o2o.develepe.obsercer;

public class ConcreteObserver  extends Observer{

	private String name;
	private String observerState;
	private ConcereteSubject subject;
	
	public ConcreteObserver(ConcereteSubject subject,String name) {
		this.name=name;
		this.subject=subject;
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		observerState=subject.getSubjectState();
		System.out.println("====>"+name+" -==>"+observerState);
	}
	public ConcreteObserver() {
		// TODO Auto-generated constructor stub
	}

	public ConcereteSubject getSubject() {
		return subject;
	}

	public void setSubject(ConcereteSubject subject) {
		this.subject = subject;
	}
	
}
