package com.imooc.o2o.develepe.proxy;

public class Client {

	public static void main(String[] args) {

		ClassSchoolGirl classSchoolGirl=new ClassSchoolGirl();
		classSchoolGirl.setName("小菜");
		Proxy proxy=new Proxy(classSchoolGirl);
		proxy.GiveDolls();
		proxy.GiveChocolate();
	}

}
