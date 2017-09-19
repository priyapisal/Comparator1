package com.scp.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
ArrayList ar=new ArrayList();
// TODO Auto-generated method stub
ar.add(new Student(20,"Pooja"));
ar.add(new Student(14,"Priya"));
ar.add(new Student(16,"Riya"));
System.out.println("UnSorted");
int i;
for(i=0;i<ar.size();i++)
	System.out.println(ar.get(i));	

Collections.sort(ar, new SortByRoll());
System.out.println("\n Sorted by RollNo");	
for(i=0;i<ar.size();i++)
	System.out.println(ar.get(i));	

Collections.sort(ar, new SortByName());
System.out.println("\n Sorted by Name");	
for(i=0;i<ar.size();i++)
	System.out.println(ar.get(i));	

	}

}
