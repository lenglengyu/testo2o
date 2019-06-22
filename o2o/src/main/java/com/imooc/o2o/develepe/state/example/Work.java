package com.imooc.o2o.develepe.state.example;

public class Work {

	private State currentState;
	private double  hours;
	private boolean finish=false;
	
	public boolean isFinish() {
		return finish;
	}
	public void setFinish(boolean finish) {
		this.finish = finish;
	}
	public Work() {
		//工作状态出是上午的工作状态
		this.currentState=new ForenoonState();
	}
	public Work(State currentState) {
		this.currentState=currentState;
	}
	public State getCurrentState() {
		return currentState;
	}
	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}
	
	public  void WriteProgram() {
		currentState.WriteProgram(this);
	}
}
