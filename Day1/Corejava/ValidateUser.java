package com.Corejava;

import java.util.Scanner;

public class ValidateUser {

			String userId="Saritha",password="123";
			int Attempt=3;
			public String UserLogin(String Id, String pass) {
				if(Id.equals(userId) && pass.equals(password))
					return "yes";
				else
					return "no";
				}
			public static void main(String[] args) {
				ValidateUser Validateuser=new ValidateUser();
				String userId,password;
				Scanner sc=new Scanner(System.in);
				int Attempt=0;
				while(true) {
					System.out.println("Enter userId");
					userId=sc.next();
					System.out.println("Enter password");
					password=sc.next();
					String res=Validateuser.UserLogin(userId, password);
					if(res.equals("yes")) {
						System.out.println("Welcome"+userId);
						break;
					}
					else {
						Attempt++;
						if(Attempt==3) {
							System.out.println("contact Admin");
						}
					}
					
				}
			}

		}



