package com.imooc.o2o.develepe.paper;

abstract class TestPaper {

	public void TestQuestion1() {
		System.out.println("这事一首简单的小情歌1");
		System.out.println("答案   "+answer1());
	}
	public void TestQuestion2() {
		System.out.println("这事一首简单的小情歌2");
		System.out.println("答案   "+answer2());
	}
	public void TestQuestion3() {
		System.out.println("这事一首简单的小情歌3");
		System.out.println("答案  "+answer3());
	}
	

	abstract String answer1();
	abstract String answer2();
	abstract String answer3();
}
