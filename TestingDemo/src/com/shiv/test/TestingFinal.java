package com.shiv.test;



import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
//import org.junit.runners.JUnit4;
import org.junit.runner.notification.Failure;

public class TestingFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi..");
		Result res= JUnitCore.runClasses(ComboTest.class);
		for(Failure f:res.getFailures())
		{
			System.out.println(""+f.toString());
		}
		System.out.println(""+res.wasSuccessful());
	}

}
