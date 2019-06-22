package com.imooc.o2o.develepe.factory;


public class SqlServerFactory implements IFactory{

	@Override
	public IUser createUser() {
		// TODO Auto-generated method stub
		return new SqlServerUser();
	}

	public IDepartment createDeapart() {
		return new SqlServerDepartment();
	}
}
