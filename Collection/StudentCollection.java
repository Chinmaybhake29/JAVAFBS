package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student implements Comparable<Student>
{
	int rollno;
	String name;
	double marks;
	
	public Student(int rollno, String name, double marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	int getRollno() {
		return rollno;
	}

	void setRollno(int rollno) {
		this.rollno = rollno;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	double getMarks() {
		return marks;
	}

	void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public int compareTo(Student o) {
		return this.rollno-o.rollno;
	}

	@Override
	public String toString() {
		return "rollno=" + rollno + ", name=" + name + ", marks=" + marks;
	}
}
class NameCompartor implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getName().compareTo(o2.getName());
	}
	
}
class MarksComparator implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		
		return Double.compare(o1.getMarks(), o2.getMarks());
	}
	
}
public class StudentCollection 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		List<Student>students=new ArrayList<Student>();
		students.add(new Student(1, "Chinmay", 89.78));
		students.add(new Student(2, "Abhay", 67.89));
		
		int choice=0;
		boolean found=false;
		System.out.println("\n1. Add Student\n2. Display list Student\n3. Sort By Rollno\n4. Sort by Name\n5. Sort By marks\n6. Search By Rollno\n7. Search By Name\n8. Search By Marks");
		do {
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch (choice) {
			case 1:
				int trollno;
				String name;
				double marks;
				
				System.out.println("Enter the rollno");
				trollno=sc.nextInt();
				
				System.out.println("Enter Student name");
				name=sc.next();
				
				System.out.println("Enter the marks");
				marks=sc.nextDouble();
				
				Student s=new Student(trollno, name, marks);
				students.add(s);
				
				break;
			case 2:
				for (Student student : students) {
					System.out.println(students);
				}
				break;
			case 3:
				System.out.println("Sorted By Rollno");
				Collections.sort(students);
				System.out.println(students);
				break;
			case 4:
				System.out.println("Sorted By Name");
				NameCompartor namecompare=new NameCompartor();
				Collections.sort(students,namecompare);
				System.out.println(students);
				break;
			case 5:
				System.out.println("Sorted By Marks");
				MarksComparator markscompare=new MarksComparator();
				Collections.sort(students,markscompare);
				System.out.println(students);
				break;
			case 6:
				System.out.println("Enter Rollno to be Search");
				int rollno=sc.nextInt();
				for (Student student : students) {
					if(student.rollno==rollno) {
						found=true;
						System.out.println(rollno + " Founded ");
					}
				}
				if(!found) {
					System.out.println("Sorry the rollno was not founded");
				}
				break;
			case 7:
				System.out.println("Enter Name to be Search");
				String sname=sc.next();
				for (Student student : students) {
					if(student.name.equalsIgnoreCase(sname)) {
						found=true;
						System.out.println(sname + " Founded ");
					}
				}
				if(!found)
				{
					System.out.println("Sorry the name was not founded");
				}
				break;
			case 8:
				System.out.println("Enter the marks to be search");
				double smarks=sc.nextDouble();
				for (Student student : students) {
					if(student.marks==smarks) {
						found=true;
						System.out.println(smarks + "founded");
					}
				}
				if(!found)
				{
					System.out.println("Sorry Marks Not Founded");
				}
				break;
			default:
				break;
			}
		} while (choice!=10);
	}
}
