package com.imooc.o2o.develepe.adapter.adapter;

public abstract class Player {

	private String name;
	public Player(String name) {
		this.name=name;
	}
	
	public abstract void attack();
	public abstract void Defence();
}
