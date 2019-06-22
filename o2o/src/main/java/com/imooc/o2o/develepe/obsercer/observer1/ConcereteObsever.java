package com.imooc.o2o.develepe.obsercer.observer1;

public class ConcereteObsever extends Observer{

	private String name;
	private String subjectState;
	private ConcereteSubject subject;
	
	public ConcereteObsever(ConcereteSubject subject,String name) {
		
		this.name=name;
		this.subject=subject;
	}
	@Override
	public void update() {

		subjectState=subject.getSubjectState();
		System.out.println("=====>"+name+"++++"+subjectState);
	}
	public ConcereteSubject getSubject() {
		return subject;
	}
	public void setSubject(ConcereteSubject subject) {
		this.subject = subject;
	}
	
	
	
}
