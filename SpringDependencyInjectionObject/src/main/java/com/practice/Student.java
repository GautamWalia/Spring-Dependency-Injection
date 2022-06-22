package com.practice;

public class Student {
	private int id;
	private MathCheat cheat;
	
	
	
	public void setId(int id) {
		this.id = id;
	}



	public void setCheat(MathCheat cheat) {
		this.cheat = cheat;
	}



	public void cheating() {
		cheat.mathCheat();
		System.out.println("My id is: "+id+ " and have done cheating");
	} 

}
