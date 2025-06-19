package Collection;

import java.util.HashSet;
import java.util.Objects;

class StudentM
{
	int rollno;
	String name;
	double marks;
	
	public StudentM() {
		// TODO Auto-generated constructor stub
	}

	public StudentM(int rollno, String name, double marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	
	@Override
	public int hashCode() {
		return this.rollno=rollno;
	}

	@Override
	public boolean equals(Object obj) {
		StudentM studentM=(StudentM)obj;
		if(this.rollno==studentM.rollno) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "StudentM [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	
}

public class StudentHashSet {
	public static void main(String[] args) 
	{
		HashSet<StudentM>students=new HashSet<StudentM>();
		students.add(new StudentM(101, "Chinmay", 89));
		students.add(new StudentM(102, "tanmay", 98));
		students.add(new StudentM(103, "Ravi", 78));
		
		for (StudentM studentM : students) {
			System.out.println(studentM);
		}
		
	}
}
