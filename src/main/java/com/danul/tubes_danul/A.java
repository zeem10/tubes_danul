package com.danul.tubes_danul;

public class A implements AddAndSubInterface {
	A(){}
	public int add(int n1, int n2) {
		return java.lang.Math.addExact(n1, n2);
	}
	public int sub(int n1, int n2) {
		return java.lang.Math.subtractExact(n1, n1);
	}
}
