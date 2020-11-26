package com.javaex.practice01;

public class Practice01App {

	public static void main(String[] args) {
		
		Practice01 camera = new Practice01();
		camera.setName("니콘");
		camera.setPrice(400000);
		camera.showInfo();
		
		System.out.println();
		
		Practice01 computer = new Practice01();
		computer.setName("LG그램");
		computer.setPrice(900000);
		computer.showInfo();
		
		System.out.println();
		
		Practice01 cup = new Practice01();
		cup.setName("머그컵");
		cup.setPrice(2000);
		cup.showInfo();
	
		
		
		
	}
}
