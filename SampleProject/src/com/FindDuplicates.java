package com;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
	public static void main(String[] args)
	{
	String names[]={"raji","sridhar","sridhar","raji","sahasra"};
	Set namesSet=new HashSet();
	for(String name:names){
		if(namesSet.add(name)==false){
		System.out.println(name);	
		}
	}
	}

}
