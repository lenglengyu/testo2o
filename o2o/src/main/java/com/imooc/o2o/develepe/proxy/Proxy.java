package com.imooc.o2o.develepe.proxy;

public class Proxy implements IGiveGift {
	private  Pursuit Pursuit; 
    public Proxy(ClassSchoolGirl classSchoolGirl) {
    	Pursuit=new Pursuit(classSchoolGirl);
    }
	@Override
	public void GiveDolls() {
		
		Pursuit.GiveDolls();
	}

	@Override
	public void GiveFlowers() {
		// TODO Auto-generated method stub
		Pursuit.GiveFlowers();
	}

	@Override
	public void GiveChocolate() {
		// TODO Auto-generated method stub
		Pursuit.GiveChocolate();
	}

}
