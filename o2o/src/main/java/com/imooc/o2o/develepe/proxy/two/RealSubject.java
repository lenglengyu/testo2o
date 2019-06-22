package com.imooc.o2o.develepe.proxy.two;

public class RealSubject extends Subject {

	@Override
	public void request() {
		// TODO Auto-generated method stub
      System.out.println("真正执行了这个方法");
	}

}
