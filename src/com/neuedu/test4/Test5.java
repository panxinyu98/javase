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
			//���м�λ��
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
			System.out.println("û�ҵ�");
		}
		else
		{
			System.out.println("�ҵ���,λ���ǣ�"+local);
		
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
