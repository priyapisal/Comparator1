package com.scp.comparator;

import java.util.Comparator;

public class SortByRoll implements Comparator<Student> {

	public int compare(Student a,Student b){
		return a.rollno - b.rollno;
	}
}
