package com.imooc.o2o.develepe.adapter.adapter;

public class clinetq {
		public static void main(String[] args) {
			
			Player player=new Forward("a");
			player.attack();
			
			Player aPlayer =new Cnter("b");
	    	//姚明需要翻译者
			Player ym=new TransLator("姚明");
			ym.attack();
			ym.Defence();
			
			
			
		}
}
