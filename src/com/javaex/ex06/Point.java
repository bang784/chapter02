package com.javaex.ex06;

public class Point {

	//필드
	private int x, y;
	
	//생성자
	public Point() {}
	
		public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//getter - setter
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void draw() {
		System.out.println("점[x=" +x+ ", y=" +y+ "]를 그렸습니다.");
	}

	public void draw(boolean opt) {
		if(opt == true) {
			System.out.println("점[x=" +x+ ", y=" +y+ "]를 그렸습니다.");
		}else {
			System.out.println("점[x=" +x+ ", y=" +y+ "]를 지웠습니다.");
		}
	
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
}