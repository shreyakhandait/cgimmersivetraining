package capg.com;

import java.util.Arrays;

public class HelloWorld {

	public static void main(String[] args) {
	int[][] numbers = new int[2][3];
	numbers[0][0]=5;
	numbers[0][1]=8;
	
	System.out.println(Arrays.deepToString(numbers));
	
	int x = 1;
	int y = x++;
	System.out.println(x);
	System.out.println(y);
	
	double A = (double)10/(double)3;
	System.out.println(A);
	}

}
