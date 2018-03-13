package com.mangodev;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		PeriodicTable tpt = new PeriodicTable();
		Element H = new Element(1, "Hydrogen", 1);
		Element He = new Element(2, "Helium", 4);
		Element U = new Element(92, "Uranium", 238);
		tpt.addElement(H);
		tpt.addElement(He);
		tpt.addElement(U);
		System.out.println(tpt.getElement(1));
		System.out.println(tpt.getElementName(0));
		System.out.println(H.getFullName());
		System.out.println(tpt.getPeriodicTable());
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a scientific equasion with an equal sign: ");
		String inpt = reader.nextLine(); // Scans the next token of the input as an int.
		//once finished
		reader.close();
		inpt = inpt.replaceAll("\\s","");
		System.out.println(inpt);
		String[] div_inpt = inpt.split("=");
		String in = div_inpt[0];
		String out = div_inpt[1];
		System.out.println(in);
		System.out.println(out);
		String[] in_comp = null;
		String[] out_comp;
		if(in.contains("+")){
			in_comp = in.split("+");
		}
		if(out.contains("+")){
			out_comp = in.split("+");
		}
		for (String comp : in_comp) {
		    System.out.println(comp);
		    System.out.println(comp.split(""));
		}
	}
}
