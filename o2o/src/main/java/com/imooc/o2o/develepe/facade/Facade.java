package com.imooc.o2o.develepe.facade;

public class Facade {
	SystemOne systemOne;
	SystemTwo  systemTwo;
	SystemThree systemThree;
	SystemFour  systemFour;
	public Facade() {
		systemOne=new SystemOne();
		systemTwo=new  SystemTwo();
		systemThree=new  SystemThree();
		systemFour=new SystemFour();
	}
	public void methodA() {
		System.out.println("进入方法A");
		systemOne.MethodOne();
		systemTwo.MethidTwo();
		systemThree.methodThree();
		systemFour.methodFour();
	}
	public  void methodB() {
		System.out.println("进入方法B");
		systemThree.methodThree();
		systemFour.methodFour();
	}
		
	}

