package com.imooc.o2o.develepe.simplefactory;

public class OpeartionFactory {

	public static  Operation  createOperate(String oparate) {
		
		Operation operation=null;
		switch (oparate) {
		case "+":
			operation=new OperationAdd();
			break;
         
		case "-":
			operation=new OperationSub();
			break;
		case "*":
			operation=new OperationMul();
			break;
		case "/":
			operation=new OperationDiv();
			break;
		}
		return operation;
	}
}
