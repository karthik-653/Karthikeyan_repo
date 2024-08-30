package com.as2;

import java.util.Set;
import java.util.HashSet;

public class EntrySet {
	public void printSetRecords(Set<String> set){
		if(set.isEmpty()){
			System.out.println("Set is an empty set");
		}else {
			System.out.println("Set elements are :"+ set);
		}
	}
	
	public static void main(String args[]){
		//Create HashSet and add some entries to it
		Set<String> set=new HashSet<String>();
		set.add("First Entry");
		set.add("Second Entry");
		set.add("Third Entry");
		//Try to enter the same entry again
		set.add("First Entry");
		EntrySet setDemo=new EntrySet ();
		//It will print records of the set
		setDemo.printSetRecords(set);
		//Create a new empty HashSet
		Set<String> emptySet=new HashSet<String>();
		//It will say that the set is an empty set
		setDemo.printSetRecords(emptySet);
		}



}
