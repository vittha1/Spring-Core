package com.springcore.ci;

public class Addition {
	
	private int a;
	private int b;
	
	public Addition(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Constructor : int , int");
	}
	public Addition(double a,double b)
	{
		this.a=(int)a;
		this.b=(int)b;
		System.out.println("Constructor : double , double");
	}

	public Addition(String a,String b)
	{
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
		System.out.println("constructor : String , String");
	}
	public void dosum()
	{
		System.out.println("this is value of a "+this.a);
		System.out.println("this is value of b "+this.b);
		System.out.println("sum is "+(this.a + this.b));
	}

}
