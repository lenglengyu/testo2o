package com.imooc.o2o.develepe.state;

public class ConcreteStateB extends State{

	@Override
	public void handle(Context context) {

		context.setState(new ConcreteStateA());
	}

	
}
