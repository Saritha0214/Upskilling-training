package com.Corejava;

public class Armstrongrange {
		 
		public static void main(String[] args) {
			int n1=100,n2=999;
			for(int i=n1;i<n2;i++) {
				int result,rem,sum=0;
				result=i;
				while(result!=0)
				{
					rem=result%10;
					sum=sum+(rem*rem*rem);
					result=result/10;
				}
				if(sum==i)
				{
					System.out.println(""+i+"");
				}
			}
	 
		}

}
