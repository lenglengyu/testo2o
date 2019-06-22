package com.imooc.o2o.develepe.obsercer.observer1;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

  private List<Observer> observers=new ArrayList<Observer>();
  
  public void attch(Observer observer) {
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
