package com.Corejava;

import java.util.Scanner;

public class ArraySearch {
	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to search");
		num=sc.nextInt();
		int[] arr= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				System.out.println(num+" "+"is present");
				count=count+1;
			}
			else
				continue;
		}
		if(count!=1) {
			System.out.println(num+" "+"is not present");
		}
	}

}
