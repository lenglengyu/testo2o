package com.imooc.o2o.develepe.state.example;

public class EveningState extends State{

	@Override
	public void WriteProgram(Work work) {
      if(work.isFinish()) {
    	  //如果下班完成 则转入下班状态
    	  work.setCurrentState(new RestState());
    	  work.WriteProgram();
      }else {
    	  if(work.getHours()<21) {
    		  System.out.println("当前时间是疲惫至极");
    	  }else {
    		  //转入睡眠状态
    		  work.setCurrentState(new SleepingState());
    		  work.WriteProgram();
    	  }
      }
      
	}

}
