package com.imooc.o2o.develepe.simplefactory;

public class ClientSimpleFactory {

	public static void main(String[] args) {

		Operation operation;
		operation=OpeartionFactory.createOperate("+");
		double a =1;
		double b=2;
		double result=operation.getResult(a,b);
		System.out.println("====>"+result);
	}

}
