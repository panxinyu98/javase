package com.neuedu.test5;

public class Test2 {
//���������ǻ����������ͣ�����������"ֵ����"
	// ���������������������ͣ�����������"����"
	//�������ַ���
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		fn(a);
		
		
		int [] arr={10,20,30};
		fn2(arr);
		System.out.println(arr[0]);
	
		
		String str="123";
        fn3(str);
		System.out.println(str);

		
	}
	
     public static void fn(int x)
     {
    	 x=x*3;
    	 System.out.println(x);
     }
     
     
     
     public static void fn2(int[] x)
     {
    	 x[0]=30;
    	System.out.println(x);
     }
     
     
     
     public static void fn3(String str)
 	{
 		str = "hello";
 	}

     
}
