package com.danul.tubes_danul;

public class C {
	double n1;
	double n2;
	
	C() {}
	
	public int add() {
		A a = new A();
		return a.add((int) java.lang.Math.round(n1), (int) java.lang.Math.round(n1));
	}
	
	public int sub() {
		A a = new A();
		return a.sub((int) java.lang.Math.round(n1), (int) java.lang.Math.round(n1));
	}
	
	public double mul() {
		B b = new B();
		return b.mul(n1, n2);
	}
	
	public double div() {
		B b = new B();
		return b.div(n1, n2);
	}

//	@Override
//	public String toString() {
//		return "C [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
//	}

	@Override
	public String toString() {
		return "C [n1=" + n1 + ", n2=" + n2 + ", add()=" + add() + ", sub()=" + sub() + ", mul()=" + mul() + ", div()="
				+ div() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
