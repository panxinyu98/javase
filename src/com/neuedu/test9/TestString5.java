package com.neuedu.test9;

public class TestString5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void getNum()
	{
		String str = "abedsfgwewerwerwerwer";
		
		int num = 0;
		for(int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			if(c == 'e')
			{
				num++;
			}
		}
		
		
		System.out.println("e出现了"+num+"次");
	}
	
	public static void getLength()
	{
		String str = "abedsfgwewerwerwerwer";
		int count=0;
		while(true)
		{
			try{
			     str.charAt(count);
			     count++;
			}
			 catch(IndexOutOfBoundsException e)
			{
				break;
			}
		}
		
		System.out.println(count);
	}
	
}
