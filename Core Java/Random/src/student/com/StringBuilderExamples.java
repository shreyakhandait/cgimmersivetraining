package student.com;

public class StringBuilderExamples {

	public static void main(String[] args) {
		StringBuilder builder1 = new StringBuilder("hydra");
		builder1.append("-");
		builder1.append("telangana");
		String str=builder1.toString();
		System.out.println("str = " +str);
		StringBuilder numbers = new StringBuilder();
		for(int i = 0;i<=100;i++) {
			numbers.append(i);
			
			
		}
		System.out.println(numbers);
	}

}
