package com.imooc.o2o.develepe.obsercer;

import java.util.ArrayList;
import java.util.List;

abstract class Subject {

	private List<Observer> observers=new ArrayList<Observer>();
	
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	public void remove(Observer observer) {
		observers.remove(observer);
	}
	public void Notify() {
		
		for (Observer observer : observers) {
			observer.update();
		}
	}
}
