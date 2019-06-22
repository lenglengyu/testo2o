package com.imooc.o2o.develepe.proxy;

public class Pursuit implements IGiveGift {

	private  ClassSchoolGirl classSchoolGirl;
	public Pursuit(ClassSchoolGirl classSchoolGirl) {
		this.classSchoolGirl=classSchoolGirl;
	}
	@Override
	public void GiveDolls() {
		// TODO Auto-generated method stub
		System.out.println(classSchoolGirl.getName()+" 娃娃");

	}

	@Override
	public void GiveFlowers() {
		// TODO Auto-generated method stub
		System.out.println(classSchoolGirl.getName()+" 花");
	}

	@Override
	public void GiveChocolate() {
		// TODO Auto-generated method stub
		System.out.println(classSchoolGirl.getName()+"巧克力");
	}

}
