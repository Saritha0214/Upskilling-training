package com.Strings.string;

public class Stringcollection {

	public static void main(String[] args) {
		String str="Java String pool refers to collection of Strings which are stored in heap memory";
		//Lower case
		String low=str.toLowerCase();
		System.out.println("LowerCase String is:" +low);
		//upper case
		String up=str.toUpperCase();
		System.out.println("UpperCase String is:"+up);
		//Replace 'a' with '$'
		String replace=str.replaceAll("a", "\\$");
		System.out.println(replace);
		//check "collection" is there or not
		String substring="collection";
		System.out.println(str.contains(substring));
		String str1="java string pool refers to collection of strings which are stored in heap memory";
		//checks if given string matches with original string
		System.out.println(str==str1);
		if(str==str1)
		{
			System.out.println("result ="+str);
		}
		else
		{
			System.out.println("Doesn't match");
		}

	}

}
