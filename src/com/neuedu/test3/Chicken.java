package com.neuedu.test3;

public class Chicken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*for(int i=0;i<=100;i++)
		{
			for(int j=0;j<=100;j++)
			{
				for(int k=0;k<=100;k++)
				{
					if ((i+j+k == 100) && (i*3+j*4+k*0.5 == 100)) {
                        System.out.println("母鸡数量：" + i+ "公鸡数量：" + j + "小鸡数量" + k);
                    }

				}
			}
		}*/
		
		
		for(int i=0;i<=33;i++)
		{
			for(int j=0;j<=25;j++)
			{
				int k=100-i-j;
				 if (i*3+j*4+k*0.5 == 100) {
	                    System.out.println("母鸡的购买数量：" + i+ "公鸡的购买数量：" + j + "小鸡的购买数量" + k);
	                }

			}
		}
			
			
			
			
			
			
			
			
	}

}
