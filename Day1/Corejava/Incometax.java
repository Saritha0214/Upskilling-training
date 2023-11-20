package com.Corejava;

import java.util.Scanner;

public class Incometax {
	public static void main(String[] args) {
		int ctc;
		double tax=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your CTC:");
		ctc=sc.nextInt();
		if(ctc>0&&ctc<=180000) {
			 tax=0;
		}
		else if(ctc>=180001&&ctc<=300000) {
			tax=(ctc*10)/100;
		}
		else if(ctc>=300001&&ctc<=500000) {
			tax=(ctc*20)/100;
		}
		else if(ctc>=500001&&ctc<=1000000) {
			tax=(ctc*30)/100;
		}
		System.out.println("Tax pay:"+tax);
	}
 
}

