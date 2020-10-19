package com;

import java.util.ArrayList;

class Container<T extends Number>{
	T value;
	
	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public void show() {
		System.out.println(value.getClass().getName());
	}
	public void demo(ArrayList<Integer> arrayList) {
		
	}
	
}

public class CollectionDemo{
	

	public static void main(String[] args) {
		Container<Float> obj = new Container<>();
		obj.value=(float) 9.9993;
		obj.show();
		obj.demo(new ArrayList<Integer>());
	}

}