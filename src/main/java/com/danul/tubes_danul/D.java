package com.danul.tubes_danul;

public class D implements PowInterface{
	
	public double pow(double n1, double n2) {
		return java.lang.Math.pow(n1, n2);
	}

	@Override
	public String toString() {
		return "D [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
