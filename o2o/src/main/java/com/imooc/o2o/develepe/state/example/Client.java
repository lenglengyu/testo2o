package com.imooc.o2o.develepe.state.example;

public class Client {

	public static void main(String[] args) {

		//紧急项目
	
		Work work=new Work();
		work.setHours(10);
		work.WriteProgram();
		
		work.setHours(15);
		work.WriteProgram();
		
		work.setHours(20);
		work.WriteProgram();
		
		work.setHours(24);
		work.WriteProgram();
	}

}
