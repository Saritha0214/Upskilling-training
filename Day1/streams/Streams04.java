package com.streams;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Transaction{
	Trader trader;
	int year;
	int value;
	
	public Trader getTrader() {
		return trader;
	}
	
	public void setTrader(Trader trader) {
		this.trader=trader;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year=year;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value=value;
	}
	
	@Override
	public String toString() {
		return "Transaction{" +
	           "trader=" + trader +
	           ", year=" + year +
	           ", value=" + value +
	           '}';
	}
	public Transaction(Trader trader, int year, int value) {
		this.trader=trader;
		this.year=year;
		this.value=value;
	}
}
public class Streams04 {

	public static void main(String[] args) {
		List<Transaction> transactions=Arrays.asList(
				new Transaction(new Trader("Prem","Hyderabad"),2011,2000),
				new Transaction(new Trader("Sony","Delhi"),2003,1700),
				new Transaction(new Trader("David","Bangalore"),2011,1900),
				new Transaction(new Trader("Honey","Pune"),2001,1400));
		
		transactions.stream()
		.filter(p -> p.trader.getCity().equalsIgnoreCase("Delhi"))
		.forEach(p -> System.out.println(p.getValue()));
		
		List<Transaction>sortedlist3= transactions.stream()
				.filter(p -> p.getYear()==(2011))
				.sorted(Comparator.comparingInt(Transaction::getValue))
				.collect(Collectors.toList());
		
		sortedlist3.forEach(System.out::println);
		
		Optional<Transaction> sortedlist9=transactions.stream()
				.max(Comparator.comparing(Transaction::getValue));
		
		System.out.println(sortedlist9);
		
		Optional<Transaction>sortedlist10=transactions.stream()
				.min(Comparator.comparingInt(Transaction::getValue));
		
		System.out.println(sortedlist10);
	}
}
