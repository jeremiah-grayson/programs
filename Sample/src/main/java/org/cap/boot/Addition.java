package org.cap.boot;

public class Addition 
{
		int a=10;
		int b=20;
		int c=a+b;
		public void add()
		{
			c=a+b;
			System.out.println(c);
			
		}
		public static void main(String args[])
		{
			Addition a=new Addition();
			a.add();
		}
	

}
