package com.imooc.o2o.develepe.decorator;


abstract class Person {

	public Person() {}
	private String name;
	public Person(String name) {
		this.name=name;
	}
	public void show() {
		System.out.println("这是===》"+name);
	}
}
