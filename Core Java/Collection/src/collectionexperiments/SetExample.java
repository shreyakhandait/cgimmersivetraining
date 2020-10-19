package collectionexperiments;

import java.util.*;
public class SetExample {

	public static void main(String args[]) {
		Set<Student>set=new HashSet<>();
		set.add(new Student(1,"shivam",21));
		set.add(new Student(3,"shahbaz",21));
		set.add(new Student(2,"avichal",21));
		set.add(new Student(3,"shahbaz",21));
		int count=set.size();
		System.out.println("count after add="+count);
		Student containingStudent=new Student(3,"shahbaz",21);
		boolean containing=set.contains(containingStudent);
		System.out.println("containing="+containing);
		
		Student tobeRemoved=new Student(1,"shivam",21);
		set.remove(tobeRemoved);
		System.out.println("displaying students");
		for(Student current:set) {
			System.out.println(current.getId()+"-"+current.getName());
		}
		
		
	}
}