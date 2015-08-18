package com.shiv.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
public class TestFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Result res= JUnitCore.runClasses(Test1.class);
		for(Failure f:res.getFailures())
		{
			System.out.println(""+f.toString());
		}
		System.out.println(""+res.wasSuccessful());
	}


}
