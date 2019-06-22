package com.imooc.o2o.develepe.morefactory;

public class VolunteerFactory implements IFactory {

	@Override
	public Leifeng CreateFactory() {
		// TODO Auto-generated method stub
		return new Volunteer();
	}

}
