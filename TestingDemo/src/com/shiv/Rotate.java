package com.shiv;

import java.util.Arrays;

public class Rotate {
	
	public  int rotate(int a[])
	{
		int []b= new int[5];
		for(int i=0;i<a.length-1;i++)
		{
	     b[i+1]=a[i]; 
	    }
		b[0]=a[a.length-1];
		
	/*	for(int j=0;j<a.length;j++)
		{
			System.out.println(b[j]+" ");
			
		}*/
		Arrays.sort(a);
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[j]+" ");
		}	
		int i=a.length;
		int m;
		if(i%2!=0)
		{
			
			m=a[i/2];
			System.out.println(m);
			return m;
		}
		else
		{
			m=(a[i/2]+a[i/2+1])/2;
			System.out.println(m);
			return m;
		}
		
		
	}

}
