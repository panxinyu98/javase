package com.neuedu.test10;

import java.util.HashSet;
import java.util.Iterator;

public class Test5 {

	//ȥ��
	//����
	public static void main(String[] args) {
		HashSet s = new HashSet();
		s.add("jack");
		s.add("jack");
		s.add("tom");
		s.add("lucy");
		s.add("abc");
		
		//HashSetû���±�
        for(Object o:s)
        {
        	System.out.println(o);
        }
		
        Iterator iter = s.iterator();
        while(iter.hasNext())
        {
        	Object o = iter.next();
        	System.out.println(o);
        }
        
	}

}
