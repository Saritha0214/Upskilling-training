package com.Corejava;

import java.util.Scanner;

public class Bubblesort {
	public static void main(String[] args)
	{
		int n=15,i,j,x;
		int[] a=new int[n];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements:");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<(n-1);i++)
		{
			for(j=0;j<(n-i-1);j++)
			{
				if(a[j]>a[j+1])
				{
				 x=a[j];
				 a[j]=a[j+1];
				 a[j+1]=x;
				}
			}
		}
		System.out.println("sorted array is:");
		for(i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}	
}

