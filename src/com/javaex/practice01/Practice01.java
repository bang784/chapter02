package com.javaex.practice01;

public class Practice01 {
	
	private String name;
	private int price;
	
	public Practice01() {
		
	}
	
	public Practice01(String name, int price) {
	
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void showInfo() {
		System.out.println("상품이름 : " + name);
		System.out.println("가격 : " + price);
	}
	
}

