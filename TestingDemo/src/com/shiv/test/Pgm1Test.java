package com.shiv.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.shiv.Pgm1;

public class Pgm1Test {
	Pgm1 p;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception { //Executed once
		System.out.println("Before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception { //Executed once
		System.out.println("After class");
	}

	@Before
	public void setUp() throws Exception {
	p= new Pgm1();
	System.out.println("Memory created");
	}
	
	@After
	public void tearDown() throws Exception {
	p=null;
	System.out.println("Memory lost");
	}

	 // @Test(timeout=1000)
	//@Test(expected=ArithmeticException.class)
	public void testAdd() {
	//	Pgm1 p=new Pgm1();
		assertEquals(5,p.add(2,3));	
	}
	@Test
	public void testSub()
	{
		//Pgm1 p= new Pgm1();
		assertEquals(2,p.sub(5,3));
		assertSame(1, 2);
		assert
	}

}
