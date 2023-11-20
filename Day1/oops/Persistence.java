package com.oops;

	abstract class Persistence1 {
		abstract public String persist();
	}
	 
	//creating FilePersistence subclass
	class FilePersistence extends Persistence1 {
		public String persist() {
			return "File persistence class called";
		}
	}
	//creating DatabasePersistence subclass
	class DatabasePersistence extends Persistence1 {
		public String persist() {
			return "Database persistence class called";
		}
	}
	 
	public class Persistence {
	 
		public static void main(String[] args) {
			//creating object
			FilePersistence persistence=new FilePersistence();
	        System.out.println(persistence.persist());
		}
		}


