package com.mangodev;

import java.util.HashMap;
import java.util.Map;

public class Element {
	private static class Holder {
        static Map<Integer, Element> map = new HashMap<Integer, Element>();
    }

    private final int atomicNumber;
    private final String fullName;
    private final double atomicMass;
    private double meltingPoint;
    private boolean isLuster;
    private boolean isRadioactive;

    public Element(int atomicNumber, String fullName, double atomicMass) {
        this.atomicNumber = atomicNumber;
        this.fullName = fullName;
        this.atomicMass = atomicMass;
        Holder.map.put(atomicNumber, this);
    }

    public static Element forAtomicNumber(int atomicNumber) {
        return Holder.map.get(atomicNumber);
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public double getAtomicMass() {
        return atomicMass;
    }

    public double getMeltingPoint() {
        return meltingPoint;
    }
    public boolean isLuster() {
    	return isLuster;
    }
    public boolean isRadioactive(){
    	return isRadioactive;
    }
    
    public void setMeltingPoint(double meltingPoint) {
    	this.meltingPoint = meltingPoint;
    }
    public void setLuster(boolean isLuster) {
    	this.isLuster = isLuster;
    }
    public void setRadioactive(boolean isRadioactive){
    	this.isRadioactive = isRadioactive;
    }
}
