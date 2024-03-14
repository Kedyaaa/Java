package com.march13;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class SetDemo {

	public static void main(String[] args) {
		HashSet<String>h1=new HashSet<String>();
		
		h1.add("Red");
		h1.add("Black");
		h1.add("Red");
		h1.add("Brown");
		h1.add("White");
		
		System.out.println(h1);
		
		LinkedHashSet<String>h2=new LinkedHashSet<String>();
		
		h2.add("Red");
		h2.add("Black");
		h2.add("Red");
		h2.add("Brown");
		h2.add("White");
		
		System.out.println(h2);
		
		TreeSet<String>h3=new TreeSet<String>();
		
		h3.add("Red");
		h3.add("Black");
		h3.add("Red");
		h3.add("Brown");
		h3.add("White");
		System.out.println(h3);
	
	}

}
