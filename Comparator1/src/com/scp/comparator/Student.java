package com.scp.comparator;
import java.io.*;
import java.util.*;
import java.lang.*;
public class Student {
int rollno;
String name;
public Student(int rollno, String name) {

	this.rollno = rollno;
	this.name = name;
}
public String toString(){
	return this.rollno+"  "+this.name;
}
}
