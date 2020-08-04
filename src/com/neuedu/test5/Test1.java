package com.neuedu.test5;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //5行6列的*
		Test1 t1=new Test1();
		t1.printStar(5,6);
		//平方
		int ret=square(9);
		System.out.println(ret);
		//求最大值
		int max=max(12,44);
		System.out.println(max);
		
		hello();
		
	}
		public  void	printStar(int m,int n)
		{
		  for(int i=0;i<m;i++)
		{
			for( int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

		public static int square(int m)
		{
			return m*m;
		}
		
		
		public static int max(int a,int b)
		{
			return a>b?a:b;
		}
		
		
		public static void hello()
		{
			System.out.println("helloworld");
		}
		
		public static int[] getArr(int a, int b, int c)
		{
			int[] arr = {a, b, c};
			
			return arr;
		}

		
}
