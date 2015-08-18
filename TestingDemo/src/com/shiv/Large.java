package com.shiv;

public class Large {
	public static int findLarge(int arr[]){  

        int lar=arr[0];  

        for(int i=0;i<arr.length;i++){  

            if(lar<arr[i])  

                lar=arr[i];  

        }  

        return lar;  

 } 
}
