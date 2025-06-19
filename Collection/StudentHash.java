package Collection;

import java.util.HashSet;
import java.util.Objects;

class Student1
{
	int rollno;
	String name;
	
	public Student1() {
		// TODO Auto-generated constructor stub
	}

	public Student1(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	
	@Override
	public int hashCode() {
		System.out.println("Inside hashcode");
		return this.rollno;
	}

	@Override
	public boolean equals(Object obj) {
		Student1 s1=(Student1) obj;
		if(this.rollno == s1.rollno) {
			return true;
		} else {
			return false;
		}
			
	}
	
}
public class StudentHash 
{
	public static void main(String[] args) {
		HashSet<Student1>sthash=new HashSet<Student1>();

		
		sthash.add(new Student1(1, "Chinmay"));
		sthash.add(new Student1(1, "Tanmay"));
		
		for (Student1 student : sthash) {
			System.out.println(student);
		}
	}
}
