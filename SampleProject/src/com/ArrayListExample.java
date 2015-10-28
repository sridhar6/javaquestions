package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;



public class ArrayListExample {
public void searchElement(ArrayList nameList, String searchElement){
	boolean searchFound;
	searchFound=nameList.contains(searchElement);
	if(searchFound){
		System.out.println(searchElement+  " found ");
	}else{
	System.out.println(searchElement+" not found");
	}
}
public static void main(String[] args){
	ArrayListExample testObj=new ArrayListExample();
	ArrayList nameList=new ArrayList();

	nameList.add("raji");
	nameList.add("sahasra");
	nameList.add("vijaya");
	nameList.add("swathi");
	nameList.add("sai");
	testObj.searchElement(nameList,"swathiv");
	
Iterator iterList=nameList.iterator();
while(iterList.hasNext()){
	System.out.println(iterList.next());
}
ListIterator listIteratorObj=nameList.listIterator(nameList.size());
while(listIteratorObj.hasPrevious()){
	System.out.println(listIteratorObj.previous());
	
}
	
	
	
}



}
