package com.oops;

	abstract class A{
		abstract int mul(int a,int b);
	}
	class B extends A{
		int mul(int a, int b) {
			int c=a*b;
			return c;
		}
	}
	public class Main {
	 
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			B b=new B();
			int result=b.mul(6,7);
			System.out.println(result);
		}
	 
	}

