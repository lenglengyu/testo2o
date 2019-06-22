package com.imooc.o2o.develepe.simplefactory;

import java.security.KeyStore.PrivateKeyEntry;

public class OperationAdd implements Operation {

  private double _numberA;
  private  double _numberB;
  
	public double get_numberA() {
	return _numberA;
}

public void set_numberA(double _numberA) {
	this._numberA = _numberA;
}

public double get_numberB() {
	return _numberA+_numberB;
}

public void set_numberB(double _numberB) {
	this._numberB = _numberB;
}

	@Override
	public double getResult(double a,double b) {
		// TODO Auto-generated method stub
		return a+b;
	}

}
