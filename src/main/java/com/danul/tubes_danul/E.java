package com.danul.tubes_danul;

import java.util.List;

public class E {
	List<String> dataList;
	
	E() {}
	
	public boolean contains(String n) {
		String empty = new String();
		if(n.equals(empty)) {
			return false;
		} else {
			return true;
		}
	}

	public List<String> getDataList() {
		return dataList;
	}

	public void setDataList(List<String> dataList) {
		C c = new C();
		if(contains(c.toString())) {
			dataList.add(c.toString());
		}
		
		D d = new D();
		if(contains(d.toString())) {
			dataList.add(d.toString());
		}
		
		this.dataList = dataList;
	}

	@Override
	public String toString() {
		return "E [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
