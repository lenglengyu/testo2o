package com.imooc.o2o.develepe.state.example;

public class ForenoonState  extends State{

	@Override
	public void WriteProgram(Work work) {
		// TODO Auto-generated method stub
		if(work.getHours()<12) {
		System.out.println("当💰前时间是 "+work.getHours()+"工作很入神");
		}else {
			work.setCurrentState(new NoonState());
			work.WriteProgram();
		}
	}

}
