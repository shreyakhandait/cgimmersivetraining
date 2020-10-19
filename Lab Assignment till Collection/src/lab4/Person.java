package lab4;
public class Person {
	private String name;
	private float age;
	public Person(String name,float age) {
		this.age=age;
		this.name=name;
	}
	//getters and setters
	public float getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public void setAge(float age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
}
