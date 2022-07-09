package org.list;

import java.util.ArrayList;

import javax.security.auth.kerberos.KerberosCredMessage;

public class Detalis {
	public static void main(String[] args) {
		//create object for list
		ArrayList li =new ArrayList();
		
		//Methods in list
		//insert values in the list
		
		//objectname.add();
		li.add(10);
		li.add("java");
		li.add(true);
		li.add(45678.45678);
		li.add('M');
		li.add(10);
		li.add(20);
		
		
		//print all the value list
		System.out.println(li);
		
		// no of values in the list
		 int size = li. size();
		//System.out.println(size);
		
		//to find the index position of a given value
		int indexOf = li.indexOf(10);
		System.out.println(indexOf);
		
		//to find the last index position of a given value
		int lastIndexOf = li .lastIndexOf(10);
		System.out.println(lastIndexOf);
		
		//to add the value based on index
		li.add(3,100);
		System.out.println(li);
		
		//to replace a value based on index
		li.set(3,'h');
		System.out.println(li);
		
		//to check a value is present or not
		boolean contains = li .contains("java");
		System.out.println(contains);
		
		//to remove a value 
		Object remove=li.remove(1);
		System.out.println(remove);
		System.out.println(li);
		
		//to remove all the value from the list
		li.clear();
		System.out.println(li);
		
		
		
		
		
		
		
		
	}

}
