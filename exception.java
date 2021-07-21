package com.exception;

public class exception {
	int i=0;
	int j=10/i;
	
	public int divide(int i,int j){
		System.out.println(i+j);
		return i/j;// risky vode
	}
		public static void main(String[] args) {
		exception e=new exception();
		e.divide(0, 10);

		
	}

}
