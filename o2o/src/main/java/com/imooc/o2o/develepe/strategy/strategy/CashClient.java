package com.imooc.o2o.develepe.strategy.strategy;

public class CashClient {

	public static void main(String[] args) {

//		Context context; 接受下拉选框的
		Context context=new Context("正常收费");
	
		double  result=context.contextInterface(100);
		System.out.println("===>"+result);
	}

}
