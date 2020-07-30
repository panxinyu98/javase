package com.neuedu.test3;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 155;
		//90-100优
		//80-89良
		//70-79中
		//60-69及格
		//60以下不及格
		
		if(score<0||score>100)
		{
			System.out.println("输入不合法");
			return;//结束方法
		}
		switch( score /10)
		{
		case 10:
		case 9:
			System.out.println("优");
			break;
		case 8:
			System.out.println("良");
			break;
		case 7:
			System.out.println("中");
			break;
		case 6:
			System.out.println("及格");
			break;
		default :
			System.out.println("不及格");
			break;
		}
		

		
		
	}

}
