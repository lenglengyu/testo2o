package com.imooc.o2o.develepe.strategy.strategy;

public class Context {

//	CashSuper cashSuper;
//	public Context(CashSuper cashSuper) {
//		this.cashSuper=cashSuper;
//	}
	CashSuper cs=null;
	public Context(String type) {
		
	  switch (type) {
		case "正常收费":
			CashNormal cs0=new CashNormal();
			cs=cs0;
			break;
		case "返利收费":
			CashRebat cs1=new CashRebat();
			cs=cs1;
			break;
		case "打折收费":
			CashReturn cs2=new CashReturn();
			cs=cs2;
			break;
		}
	}
	public double  contextInterface(double monney) {
//		double result=cs.acceptCash(monney);
	   return cs.acceptCash(monney);
	}
}
