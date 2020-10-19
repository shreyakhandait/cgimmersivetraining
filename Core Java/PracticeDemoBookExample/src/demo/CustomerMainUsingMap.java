package demo;

import java.util.Collection;
import java.util.TreeMap;
import java.util.Map;

public class CustomerMainUsingMap {
	private Map<Integer,Customer> store=new TreeMap<>();
	public static void main(String[] args) {
		CustomerMain obj=new CustomerMain();
		obj.initialize();
	}
	public void initialize() {
		RegularCustomer regularCustomer1=new RegularCustomer(23,5700,"savings","hyderabad");
		BusinessCustomer businessCustomer1=new BusinessCustomer(456,20000,"current","capgemini");
		RegularCustomer regularCustomer2=new RegularCustomer(789,3500,"savings","pune");
		BusinessCustomer businessCustomer2=new BusinessCustomer(999,15000,"current","wipro");
		store.put(regularCustomer1.getId(),regularCustomer1);
		store.put(businessCustomer1.getId(),businessCustomer1);
		store.put(regularCustomer2.getId(),regularCustomer2);
		store.put(businessCustomer2.getId(),businessCustomer2);
		display();
	}
	public void display() {
		System.out.println("All customer details");
		for(Customer c:store.values()) {
			boolean reg= c instanceof RegularCustomer;
			if(reg){
				RegularCustomer r=(RegularCustomer) c;
				System.out.println("id:"+r.getId()+" balance:"+r.getBalance()+" "+r.getHouseAddress());
			}
			boolean buss= c instanceof BusinessCustomer;
			if(buss){
				BusinessCustomer b=(BusinessCustomer) c;
				System.out.println("id:"+b.getId()+" balance:"+b.getBalance()+" "+b.getCompany());
			}
		}
	}

}