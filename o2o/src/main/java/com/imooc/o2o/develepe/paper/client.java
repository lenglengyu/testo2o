package com.imooc.o2o.develepe.paper;

public class client {

	public static void main(String[] args) {

		System.out.println("学生甲抄的试卷");
		
		TestPaper studentA=new TestPaperA();
		studentA.TestQuestion1();
		studentA.TestQuestion2();
		studentA.TestQuestion3();
		System.out.println("=====>");
		
		System.out.println("学生乙抄的试卷");
		TestPaper studentB=new TestPaperB();
		studentB.TestQuestion1();
		studentB.TestQuestion2();
		studentB.TestQuestion3();
		
	}

}
