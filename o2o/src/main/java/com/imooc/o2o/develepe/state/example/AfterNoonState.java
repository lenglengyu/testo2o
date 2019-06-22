package com.imooc.o2o.develepe.state.example;

public class AfterNoonState extends State{

	@Override
	public void WriteProgram(Work work) {

		if(work.getHours()<17) {
			System.out.println("当前的时间是"+work.getHours());
		}else {
			work.setCurrentState(new EveningState());
			work.WriteProgram();
		}
	}

	
}
