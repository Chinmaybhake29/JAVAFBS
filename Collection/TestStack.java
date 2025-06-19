package Collection;

import java.util.Stack;

class Students
{
	int rollno;
	String name;
	double marks;
	
	public Students() {
		// TODO Auto-generated constructor stub
	}

	public Students(int rollno, String name, double marks) {
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
public class TestStack 
{
	public static void main(String[] args) 
	{
		Stack<Students>stack=new Stack<Students>();
		stack.push(new Students(1, "Chinmay", 98));
		stack.push(new Students(2, "Tanmay", 78));
		stack.push(new Students(3, "Amol", 67));
		
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
	}
}
