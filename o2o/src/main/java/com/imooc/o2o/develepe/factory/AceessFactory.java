package com.imooc.o2o.develepe.factory;

public class AceessFactory implements IFactory{

	@Override
	public IUser createUser() {
		// TODO Auto-generated method stub
		return new AccessUser();
	}
	
	public IDepartment creteDepartment() {
		return new SqlServerDepartment();
	}

}
