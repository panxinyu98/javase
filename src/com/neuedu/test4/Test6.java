package com.neuedu.test4;

import java.util.Arrays;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] arr={12,34,56,11,7,9,34};
         
         //排序
         Arrays.sort(arr);
         
        /* for(int i=0; i<arr.length;i++)
         {
        	 System.out.println(arr[i]);
   
         }*/
         
         //数组的遍历
         for(int item:arr)
         {
        	 System.out.println(item);
         }
         
         
         
		//二分查找 11
       int index= Arrays.binarySearch(arr, 11);
       System.out.println(index);
       
       
	}

}
