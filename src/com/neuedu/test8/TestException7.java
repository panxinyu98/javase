package com.neuedu.test8;

public class TestException7 {
     //throw 手动抛出
	 //throws 向上抛出，向上面的方法里面抛出（eg：向main里抛）
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//boolean flag = isZhiShu(13);
		
		//System.out.println(flag);
		
		try {
			zhiShu(9);
			
			System.out.println("质数");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("不是质数");
		}

	}
	
	public static boolean isZhiShu(int n)
	{
		for(int i=2; i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static void zhiShu(int n) throws Exception
	{
		for(int i=2; i<n;i++)
		{
			if(n%i==0)
			{
				throw new Exception();
			}
		}
	}

}







