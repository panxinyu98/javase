package com.neuedu.test10;



import java.util.LinkedList;

//先进先出
public class TestQueue {

	public static void main(String[] args) {
		
		MyQueue<String> q=new MyQueue<>();
		
		q.put("AA");
		q.put("BB");
		q.put("CC");
		
		/*//没有remove将值抛出，一直查询第一个值
		System.out.println(q.get());
		System.out.println(q.get());
		System.out.println(q.get());
		System.out.println(q.get());//出异常了
*/		
		
		while(!q.isEmpty())//!q.isEmpty()->非空
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
