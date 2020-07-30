package com.neuedu.test3;

public class Test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//求两个数的最大公约数
		//从最大的数开始，除出来的第一个数就是最大公约数
				int m=8;
				int n=12;
				int result=1;
				
				int min=m<n?m:n;
				
				for(int i=min;i>=1;i--)
				{
					if(m%i==0&&n%i==0)
					{
						result=i;
						break;
					}
						
				}
				
				System.out.println(m+"和"+n+" 的最大公约数："+ result);
			}

	}


