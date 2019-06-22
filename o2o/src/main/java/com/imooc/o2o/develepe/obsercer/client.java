package com.imooc.o2o.develepe.obsercer;

public class client {
   public static void main(String[] args) {
	
	   ConcereteSubject subject=new ConcereteSubject();
	   
	   subject.attach(new ConcreteObserver(subject, "x"));
	   subject.attach(new ConcreteObserver(subject, "Y"));
	   subject.attach(new ConcreteObserver(subject, "z"));
	   
	   subject.setSubjectState("abc");
	   subject.Notify();
   }
}
