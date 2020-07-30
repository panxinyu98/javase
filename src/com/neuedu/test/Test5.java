package com.neuedu.test;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             char a='a';
             char b='中';
             char c='\uBBBB';
             char d='\t';
             char f='\'';
             char g='\\';
             /*
              * \r 回到行首
              * \n 换行
              * 
              * \b空格
              * 0-9： 十进制 48
              * A-Z:十进制65
              * a-z：十进制97
              * 
              * 
              * */
             
             System.out.println(a);
             System.out.println(c);
             System.out.println(d);
             System.out.println(b);
             System.out.println(f);
             System.out.println(g);
             
             
             System.out.println("escape\\bchar");
             System.out.println("escape\\tchar");
             System.out.println("escape\\rchar");
             System.out.println("escape\\nchar");
             System.out.println("\\我在斜线里\\");
             System.out.println("\'我在单引号里\'");
             System.out.println("'我没有单引号'");
             System.out.println("\"我在双引号里\"");
             System.out.println("我没有双引号");

             boolean flag=true;
             boolean flag2=false;
             
             
             
             
             

	}

}
