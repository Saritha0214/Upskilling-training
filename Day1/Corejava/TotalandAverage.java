package com.Corejava;

import java.util.Scanner;

public class TotalandAverage {
	public static void main(String[] args) {
			int student[][]=new int [3][3];
			int sum=0,j,sumA=0,sumB=0,sumC=0;
			Scanner obj=new Scanner(System.in);
			System.out.println("Enter student marks");
			for(int i=0;i<3;i++) {
				System.out.println("A,B,C marks");
				for(j=0;j<3;j++) {
					student[i][j]=obj.nextInt();
					sum=sum+student[i][j];
				}
			}
			System.out.println("Sum of all students marks:"+sum);
			float avg=sum/9;
			System.out.println("Average of total marks:"+avg);
			
			for(int k=0;k<3;k++) {
				sumA=sumA+student[0][k];
			}
			System.out.println("sum of A:"+sumA);
			float avgA=sumA/3;
			System.out.println("avgA:"+avgA);
			
			for(int l=0;l<3;l++) {
				sumB=sumB+student[1][l];
			}
			System.out.println("sum of B:"+sumB);
			float avgB=sumB/3;
			System.out.println("avgB:"+avgB);
			
			for(int m=0;m<3;m++) {
				sumC=sumC+student[2][m];
			}
			System.out.println("sum of C:"+sumC);
			float avgC=sumC/3;
			System.out.println("avgB:"+avgC);
		}

}
