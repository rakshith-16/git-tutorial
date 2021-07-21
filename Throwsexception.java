package com.exception;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Throwsexception {
public static void main(String[] args) {
	dostuff();
}
public static void dostuff(){
	try {
		domorestuff();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static void domorestuff() throws InterruptedException{
	for(int i=0;i<=5;i++){
		System.out.println(i);
		Thread.sleep(3000);

	}
	}
}
