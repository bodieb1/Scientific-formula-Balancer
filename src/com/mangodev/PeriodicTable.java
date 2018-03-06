package com.mangodev;

import java.util.ArrayList;

public class PeriodicTable {
	public PeriodicTable(){
		
	}
	ArrayList<Element> thePeriodicTable = new ArrayList<Element>(200);
	public ArrayList<Element> getPeriodicTable(){
		return thePeriodicTable;
	}
}
