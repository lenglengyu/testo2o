package com.imooc.o2o.develepe.decorator;

abstract class Finery extends Person {

	private Person person;
	
	public void decorastor(Person person) {
		this.person=person;
	}
	public void show() {
		if(person !=null) {
			person.show();
		}
	}
}
