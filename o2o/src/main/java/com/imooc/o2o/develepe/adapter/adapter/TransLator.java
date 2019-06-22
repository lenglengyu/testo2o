package com.imooc.o2o.develepe.adapter.adapter;

public class TransLator extends Player{

	private ForegnCenter foregnCenter=new ForegnCenter();
	public TransLator(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		foregnCenter.setName(name);
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		foregnCenter.Atack();
	}

	@Override
	public void Defence() {
		// TODO Auto-generated method stub
		foregnCenter.Defence();
	}

}
