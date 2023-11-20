package com.collections;

import java.util.HashSet;
import java.util.Iterator;

public class Collections02 {

	public static void main(String[] args) {
		
		//creating HashSet and adding elements
		
		HashSet<String> set = new HashSet<String>();
		set.add("saritha");
		set.add("sravani");
		set.add("grace");
		set.add("priya");
		set.add("rasagna");
		
		//traversing elements
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
