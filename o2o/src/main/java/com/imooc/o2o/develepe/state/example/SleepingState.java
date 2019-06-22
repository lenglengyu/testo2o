package com.imooc.o2o.develepe.state.example;

public class SleepingState extends State{

	@Override
	public void WriteProgram(Work work) {
        System.out.println("当前时间是下班状态");		
	}

}
