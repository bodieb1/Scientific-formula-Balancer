package com.mangodev;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PeriodicTable {
	public PeriodicTable(){
		
	}
	private static List<Element> thePeriodicTable = new ArrayList<>();
	
	public List<Element> getPeriodicTable(){
		return thePeriodicTable;
	}
	public void addElement(Element e){
		String name = e.getFullName();
		thePeriodicTable.add(e);
	}
	public String getElementName(int num){
		return thePeriodicTable.get(num).getFullName();
	}
	public Element getElement(int num){
		return thePeriodicTable.get(num);
	}
}
