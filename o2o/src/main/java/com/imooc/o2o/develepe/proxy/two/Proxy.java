package com.imooc.o2o.develepe.proxy.two;

public class Proxy extends Subject {

	  private RealSubject realSubject;
	  public Proxy() {}

	@Override
	public void request() {

		if(realSubject==null) {
			realSubject=new RealSubject();
		}
		realSubject.request();
	}

}
