package com.example.day1;

class Test{
	private String s="swapna";
	private int id=28;
	
	public Test() {
		
	}
	
	public Test(String s, int id) {
		this.s=s;
		this.id=id;
	}
	
	public void setS(String s) {
		this.s=s;
	}
	public String getS() {
		return s;
	}
}

public class Day1 {
	public static void main(String[] main) {
		
		
		Test test= new Test();
//		test.setS("hey");
		System.out.println(test.getS());
		
	}
}
