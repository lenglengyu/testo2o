package com.imooc.o2o.develepe.obsercer.observer1;

import com.imooc.o2o.develepe.build.ConcreteBuildB;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConcereteSubject subject=new ConcereteSubject();
		subject.attch(new ConcereteObsever(subject, "x"));
		subject.attch(new ConcereteObsever(subject, "y"));
		subject.attch(new ConcereteObsever(subject, "z"));
		
		subject.setSubjectState("abc");
		subject.Notify();
		
	}

}
