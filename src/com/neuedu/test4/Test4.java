package com.neuedu.test4;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//冒泡排序
		int[] arr={12,22,3,56,78,21};
		for(int i=1;i<arr.length;i++) //比较趟数    
			//第几次循环，第一趟 比较五回 ，第二趟比较四回，第三趟比较三回，...
			//防止越界，每次输出上一次的最大值，都要把输出的那个减去，再进行比较
		{
			for(int j=0;j<arr.length-i;j++)//j比较次数
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=	arr[j+1];
					arr[j+1]=temp;
							
							
				}
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{ 
			System.out.println(arr[i]);
	    }
		
	}
	

}
