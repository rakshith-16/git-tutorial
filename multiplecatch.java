package com.exception;

public class multiplecatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(manipulation(10,0));
		manipulation(10,0);

		//no compile error
	}
public static int manipulation(int i, int j){

	
	try{
		return i/j;
	}catch(NullPointerException e){
		return 100;
	}catch(Exception e){

		return 0;
	}finally{
//		return 10;
		System.out.println("hi this is finally block");
	}
	//multiple catch block for one try block
	//the parent exception object shd defined towards bottom.
}
}
