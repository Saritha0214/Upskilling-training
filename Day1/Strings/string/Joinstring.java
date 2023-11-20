package com.Strings.string;

public class Joinstring {

	public static void main(String[] args) {
		//declaring string and method
		String s1="Hello," + "How are you";
		String s2="H";
		System.out.println(s1);
		System.out.println(s1.charAt(4));
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.concat(s1));
		System.out.println(s2.contains("H"));
		System.out.println(s1.contains("o"));
		System.out.println(s1.endsWith("u"));
		System.out.println(s1.indexOf(3));
		System.out.println(s1.toLowerCase());
		

	}

}
