package com.imooc.o2o.develepe.decorator;

public class Clinet {

	public static void main(String[] args) {

		Person person=new Person("小菜") {
		};
		System.out.println("第一种装扮");
		TShirts tShirts=new TShirts();
		BigTrous bigTrous=new BigTrous();
		tShirts.decorastor(person);
		bigTrous.decorastor(tShirts);
		bigTrous.show();
	}

}
