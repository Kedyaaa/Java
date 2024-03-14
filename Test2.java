package com.mar12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class Test2 {

	public static void main(String[] args) {
		ArrayList<String>a1=new ArrayList<String>();
		a1.add("Red");
		a1.add("black");
		a1.add("brown");
		a1.add("white");
		a1.add("orange");
		a1.add("brown");
		System.out.println(a1);
		
		System.out.println(a1.indexOf("brown"));
		System.out.println(a1.lastIndexOf("brown"));
		Collections.sort(a1);
		System.out.println(a1);
		
		Iterator itr=a1.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}

	}

}
