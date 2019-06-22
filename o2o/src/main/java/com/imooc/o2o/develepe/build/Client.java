package com.imooc.o2o.develepe.build;


public class Client {

	public static void main(String[] args) {

		Deractor deractor=new Deractor();
		
		BUilder b1=new ConcreteBuilder1();
		BUilder  b2=new ConcreteBuildB();
		
		deractor.constractor(b1);
		Product product=b1.GetaaResult();
		product.show();
		
		//=============================
		deractor.constractor(b2);
		Product procut2=b2.GetaaResult();
		procut2.show();
	}

}
