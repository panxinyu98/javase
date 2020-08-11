
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr={1,2,6,9,13,55,88};
		System.out.println(TestSearch(arr,6,0,arr.length-1));
	}

	public static int TestSearch(int arr[],int key,int low,int high)
	{
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
		
		return local;
		
		 
		
	} 
}
