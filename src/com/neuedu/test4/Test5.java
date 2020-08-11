package com.neuedu.test4;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr={1,2,6,9,13,55,88};
		int key=3;
		int low=0;
		int high=arr.length-1;
		int local=-1;
		
		while(low<=high)
		{
			//找中间位置
			int mid=(low+high)/2;
			if(key>arr[mid])
			{
				low=mid+1;
				
			}
			else if(key<arr[mid])
			{
				high=mid-1;
				
			}
			
			else
			{
				local=mid;
				break;
			}
			
		}	
		
		if(local == -1)
		{
			System.out.println("没找到");
		}
		else
		{
			System.out.println("找到了,位置是："+local);
		
		}

		/////////////////////////////////////
		int i,j;
        int a[]={9,27,10,1,49};
        for(i=0;i<a.length-1;i++){
               int k=i;
               for(j=i;j<a.length;j++)
                       if(a[j]>a[k]) k=j;
               int temp=a[i];
               a[i]=a[k];
               a[k]=temp;            
        }
       for(i=0;i<a.length;i++)
              System.out.println(a[i]+"");
        System.out.println();

			
		
		
		
		
		
		
		
		
	}

}

