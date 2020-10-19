package interfacee.com;

public class AcerCalculator implements ICalculator{

	public int add(int num1, int num2){
		int result=num1+num2;
		return result;
	}	
	
	public int sub(int num1, int num2) {
		return num1-num2;
	}
	
	public double cosine(double val) {
		return 0;
	}
	
	
}
