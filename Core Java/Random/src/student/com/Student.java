package student.com;

public class Student {
	 
	Student(){	
		this(-1,"");
		}
	
	Student(int id){
		this(id,"");
	}
	
	Student(int idArg,String nameArg){
		id=idArg;
		this.name=nameArg;
		
	}
	
	int id;
	String name;
	
	void setId(int id) {
		this.id=id;
	}
	
	int getId() {
		return id;
	}
	
	void setName(String name) {
		this.name=name;
	}
	
	String getName() {
		return name;
	}
	
	public String toString() {
		String str = id + "-" + name;
		return str;
	}
	
//	Student st1 = new Student(1, "Shivam");
//	Student st2=null;
//	boolean flag=st1.equals(st2);
	
	@Override
	
	    public boolean equals(Object obj) {
	        if (this == obj) {
	            return true;
	        }
	        if (obj == null || !(obj instanceof Student)) {
	            return false;
	        }
	        Student that = (Student) obj;
	        return this.id == that.id;
	    }

}