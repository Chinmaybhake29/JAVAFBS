package Collection;

import java.util.LinkedList;
import java.util.Queue;

class Students1
{
	int rollno;
	String name;
	double marks;
	
	public Students1() {
		// TODO Auto-generated constructor stub
	}

	public Students1(int rollno, String name, double marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student { Rollno: "+ rollno + ","
				+ " Name: "+ name + "," + ","
				+ " Marks: " + marks+" } ";
	}
	
}
public class TestQueue {
	public static void main(String[] args) {
		Queue<Students1>que=new LinkedList<Students1>();
		que.add(new Students1(1, "Chinmay", 90));
		que.add(new Students1(2, "Tanmay", 78));
		que.add(new Students1(3, "Rohit", 78));
		
		while (!que.isEmpty()) {
			System.out.println(que.remove());
		}
	}
}
