package com.javaex.practice02;

public class Practice02 {

	private int x;
	private int y;
	
	public Practice02() {
		
	}

	public Practice02(int x, int y) {
	
		this.x = x;
		this.y = y;
	}

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
		System.out.println("점[x=" + x + ", y=" + y + "]을 그렸습니다.");
	}
	
	
	
	
	
}
