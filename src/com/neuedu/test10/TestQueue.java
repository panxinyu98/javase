package com.neuedu.test10;



import java.util.LinkedList;

//�Ƚ��ȳ�
public class TestQueue {

	public static void main(String[] args) {
		
		MyQueue<String> q=new MyQueue<>();
		
		q.put("AA");
		q.put("BB");
		q.put("CC");
		
		/*//û��remove��ֵ�׳���һֱ��ѯ��һ��ֵ
		System.out.println(q.get());
		System.out.println(q.get());
		System.out.println(q.get());
		System.out.println(q.get());//���쳣��
*/		
		
		while(!q.isEmpty())//!q.isEmpty()->�ǿ�
		{
			System.out.println(q.get());
		}
	}

}
class MyQueue<T>
{
	LinkedList<T> list=new LinkedList<>();
	
	public void put(T t)
	{
		list.addLast(t);
	}
	
	public T get()
	{
		return list.removeFirst();
		
	}
	
	public boolean isEmpty()
	{
		return list.isEmpty();
	}
	
	public int size()
	{
		return list.size();
	}
}
