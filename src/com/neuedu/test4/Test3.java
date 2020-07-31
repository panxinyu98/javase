package com.neuedu.test4;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Êı×éÄæĞò 
		int[] arr = {1,2,3,6,7,8};
		for(int i=0; i<arr.length/2;i++)
		{
			int temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}
		
		//´òÓ¡
		for(int i=0;i<arr.length;i++)
		{ 
			System.out.print(arr[i]+"\t");
	    }
		
		
	}

}
