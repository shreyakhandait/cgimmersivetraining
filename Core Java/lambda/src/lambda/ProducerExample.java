package lambda;

public class ProducerExample {

	public static void main(String[] args) {
		IProduces producer = new IProduces() {
			
			@Override
			public String produce() {
				return "Welcome to Pune";
			}
		};
		
		String greeting = producer.produce();
		System.out.println(greeting);
	}

}
