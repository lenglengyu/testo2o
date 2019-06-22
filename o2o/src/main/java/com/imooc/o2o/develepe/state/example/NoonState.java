package com.imooc.o2o.develepe.state.example;

public class NoonState extends State{

	@Override
	public void WriteProgram(Work work) {
		
		if(work.getHours()<13) {
			System.out.println("这事中午的时间");
		}else {
			work.setCurrentState(new AfterNoonState());
			work.WriteProgram();
		}
	}

}
