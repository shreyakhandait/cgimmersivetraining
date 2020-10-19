package com;

public class CurrentAccountMain {
	
	public static void overdraft(double amount) throws NullPointerException{
		try {
			if(amount >= 10000) {
				throw new NullPointerException("Limit exceeds");
				
			}else {
				System.out.println("Enter the amount to withdraw: " + amount);
			}
		}catch(NullPointerException e){
			System.out.println("Exception occoured: "  + e);
		}
	}

	public static void main(String[] args) {
		try {
			overdraft(50000);
		}catch(Exception e) {
			System.out.println("Another exception occured: " + e);
		}

	}

}
