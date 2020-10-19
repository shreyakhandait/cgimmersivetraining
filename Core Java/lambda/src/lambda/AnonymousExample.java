package lambda;

import inheritance.ICalculator;

public class AnonymousExample {

    public static void main(String args[]){
        ICalculator calculator=new ICalculator() {
            public int add(int a, int b) {
                return a+b;
            }
        };
       int result= calculator.add(1,2);
       System.out.println("result="+result);
    }
}