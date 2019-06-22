package com.imooc.o2o.develepe.strategy;

public class StrategyClient {

	public static void main(String[] args) {

		Context context;
		context=new Context(new ConcreateStrategyA());
		context.ContextInterface();
		context=new Context(new ConcreteStrategyB());
		context.ContextInterface();
		context=new Context(new ConcreteStrategyC());
		context.ContextInterface();
	}

}
