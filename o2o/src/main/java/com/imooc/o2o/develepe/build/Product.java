package com.imooc.o2o.develepe.build;

import java.awt.List;

public class Product {

	List parts=new List();
	public void add(String part) {
		
		parts.add(part);
	}
	public void show() {
		System.out.println("====>");
	}

}
