package student.com;

public class Person {
	
	Person(String nameArg, float ageArg){
		this.name=nameArg;
		this.age=ageArg;
	}
	
	String name;
	float age;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public float getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(float age) {
		this.age = age;
	}
	
	

}
