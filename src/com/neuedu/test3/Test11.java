package com.neuedu.test3;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		for(int i=1;;i++)
		{
			sum+=i;
			if(sum>=66)
			{  
			   System.out.println(i);
			   System.out.println(sum);
			   break;//调到for外面,here那
			}
		}
		//here	
	}

}
