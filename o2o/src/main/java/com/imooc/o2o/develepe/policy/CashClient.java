package com.imooc.o2o.develepe.policy;

public class CashClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		CashSuper cashSuper;
		cashSuper=CashFactory.createCashAccept("正常收费");
		double price=cashSuper.acceptCash(100);
		System.out.println("====="+price);
	}

}
