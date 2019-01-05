package com.danul.tubes_danul;

public class B implements MulAndDivInterface {
//<<<<<<< HEAD
//	B() {}
//	public double mul(double n1, double n2) {
//		return n1 * n2;
//	}
//	public double div(double n1, double n2) {
//		return n1 / n2;
//	}
//=======
//	
	B() {}
	
	public double mul(double n1, double n2) {
		return n1 * n2;
	}

	public double div(double n1, double n2) {
		return n1 / n2;
	}

	@Override
	public String toString() {
		return "B [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

//	@Override
//	public String toString() {
//		return "B [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
//	}

//>>>>>>> branch 'master' of https://github.com/linkvirg/tubes_danul.git
}
