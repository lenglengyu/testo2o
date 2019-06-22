package com.imooc.o2o.develepe.model;

public class Client {

	public static void main(String[] args) {

		AbstractClass class1;
		class1=new ConcreteClassA();
		class1.TemplateMethod();
		
		class1=new ConcreteClassB();
		class1.TemplateMethod();
	}

}
