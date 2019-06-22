package com.imooc.o2o.develepe.morefactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IFactory factory=new UndagradeFactory();
		Leifeng stu=factory.CreateFactory();
		stu.BuyRice();
		
	}

}
