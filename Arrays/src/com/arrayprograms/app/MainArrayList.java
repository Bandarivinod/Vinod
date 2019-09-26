package com.arrayprograms.app;

import java.util.ArrayList;
import java.util.Scanner;

public class MainArrayList 
{
 public static void main(String[] args) 
 {
	 Scanner scanner=new Scanner(System.in);
	 System.out.println("enter array list");
	ArrayList<String> ar=new ArrayList<String>();
	//required output vinod@123
	
	ar.add("v");
	ar.add("i");
	ar.add("n");
	ar.add("o");
	ar.add("d");
	ar.add(1, "123");
	
	ar.remove(4);
	System.out.println(ar);
	 
	 
}
}
