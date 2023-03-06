package week3.day1;

public class Calculator {
	
	public  void  add(int a,int b) {
		 System.out.println(a+b);
	}
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	
	public void sub(double a,double b) {
		System.out.println(a-b);
		
	}
	public void sub(int a,int b ) {
		System.out.println(a-b);
		
	}
	public void mul(int a, double b) {
		System.out.println(a*b);
	}
	public void mul(double a,double b) {
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		Calculator obj = new Calculator();
		obj.add(10,20);
		obj.add(10,20,30);
		obj.sub(20.5,10.5);
		obj.sub(25,10);
		obj.mul(10,10.5);
		obj.mul(10.5,15.5);
		
	}
	
}
