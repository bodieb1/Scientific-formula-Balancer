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
    private final double meltingPoint;

    private Element(int atomicNumber, String fullName, double atomicMass, double meltingPoint) {
        this.atomicNumber = atomicNumber;
        this.fullName = fullName;
        this.atomicMass = atomicMass;
        this.meltingPoint = meltingPoint;
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
}
