package com;

public class Producer {

	int i = 0;
	
	public void produce() {
		i++;
		System.out.println("producer "  + i);
	}
}
