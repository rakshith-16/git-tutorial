package com.exception;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(manipulation(10,0));
		manipulation(10,0);

		//no compile error
	}
public static int manipulation(int i, int j){
//	System.out.println(i/j);
	//any mechanism ? if any mechanism jvm will execute, if not then
	//the main will creete N OBJECT OF THR RELEVANT EXECEPTIOn and pass it to jvm
	
	try{
		return i/j;
	}catch(Exception e){
//		System.exit(0); only in this condition finally will not be called.
		return 0;
	}finally{
//		return 10;
		System.out.println("hi this is finally block");
	}
}
}
