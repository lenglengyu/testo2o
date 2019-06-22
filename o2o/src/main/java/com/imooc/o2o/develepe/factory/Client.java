package com.imooc.o2o.develepe.factory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user=new User();
		IFactory sqlServerUser=new SqlServerFactory();
		
		IUser sqlUser=sqlServerUser.createUser();
		sqlUser.insert(user);
		///===================
		IFactory accessServer=new AceessFactory();
		IUser access=accessServer.createUser();
		access.insert(user);
	}

}
