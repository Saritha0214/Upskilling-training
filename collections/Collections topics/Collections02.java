package collections.assignments;

import java.util.HashSet;
import java.util.Iterator;

public class Collections02 {

	public static void main(String[] args) {
		
		//creating HashSet and adding elements
		
		HashSet<String> set = new HashSet<String>();
		set.add("Krupa");
		set.add("Yani");
		set.add("Grace");
		set.add("Prem");
		set.add("Krupa");
		
		//traversing elements
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
