package interfacee.com;
public class CalculatorMainn {
	 
	public static void main(String args[]) {
		ICalculator calcy=new AcerCalculator();
		int opResult1=calcy.add(2, 5);
		System.out.println("result="+opResult1);
	}
	
}