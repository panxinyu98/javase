package com.neuedu.test7;

import java.util.Random;

public class TestCard {

public static void main(String[] args) {
		
		//定义一个数组， 52
		Card[] cs = new Card[52];
		
		String[] faces = {"红桃","黑桃","方片","梅花"};
		
		String[] value ={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		
		int k = 0;
		
		for(int i=0; i<faces.length;i++)
		{
			for(int j=0; j<value.length;j++)
			{
				//不好
				Card c = new Card(faces[i], value[j]);
				
				//设置num
				if(value[j].equals("A"))
				{
					c.num = 1;
				}
				else if(value[j].equals("J"))
				{
					c.num = 11;
				}
				else if(value[j].equals("Q"))
				{
					c.num = 12;
				}
				else if(value[j].equals("K"))
				{
					c.num = 13;
				}
				else
				{
					//String -> int
					c.num = Integer.parseInt(value[j]);
				}
				
				//cs[i*13+j] = c;
				cs[k++] = c;
			}
		}
		
		//打印数组
		/*for(Card c: cs)
		{
			System.out.println(c.face +"\t" +c.value);
		}*/
		
		Random r = new Random();
		//shuffle
		for(int i=0;i<100;i++)
		{
			int index = r.nextInt(52);//0-51随机数
			
			Card temp = cs[index];
			cs[index] = cs[cs.length-1];
			cs[cs.length-1] = temp;
		}
		
		//打印数组
		for(Card c: cs)
		{
			System.out.println(c.face +"\t" +c.value);
		}
		
		//取前三张牌,排序
		for(int i=1;i<3;i++)
		{
			for(int j=0; j<3-i;j++)
			{
				if(cs[j].num > cs[j+1].num)
				{
					Card temp = cs[j];
					cs[j] = cs[j+1];
					cs[j+1] = temp;
				}
			}
		}
		
		//判断同花顺
		if(cs[0].face.equals(cs[1].face) && cs[0].face.equals(cs[2].face))
		{
			if(cs[1].num - cs[0].num == 1 && cs[2].num - cs[1].num == 1)
			{
				System.out.println("同花顺");
			}
			else if(cs[0].num == 1 && cs[1].num == 12 && cs[2].num == 13)
			{
				System.out.println("同花顺");
			}
			else
			{
				System.out.println("不是同花顺");
			}
		}
		else
		{
			System.out.println("不是同花顺");
		}
	}

}

class Card{
	
	String face;
	String value;
	int num;
	
	public Card(String face, String value)
	{
		this.face = face;
		this.value = value;
	}
	
}
