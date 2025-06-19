package Collection;

import java.util.ArrayList;
import java.util.Scanner;

class Employee1
{
	int id;
	String name;
	double salary;
	
	public Employee1() {
		// TODO Auto-generated constructor stub
	}

	public Employee1(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
public class Collection {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Employee1>employees=new ArrayList<Employee1>();
		System.out.println("How Many data do you wants to be add");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) 
		{
			System.out.println("Enter Employee id, name, Salary");
			int id=sc.nextInt();
			String name=sc.next();
			double salary=sc.nextDouble();
			employees.add(new Employee1(id, name, salary));
		}
		
		
		boolean found=false;
		System.out.println("1. Search By Id");
		System.out.println("2. Search By Name");
		int choice=sc.nextInt();
		
		switch (choice) {
		case 1:
			int id=sc.nextInt();
			for(Employee1 e:employees) {
				if(e.id==id) {
					found=true;
					System.out.println(e.toString()+"Founded");
					break;
				}
			}
			if(!found) {
				System.out.println("Not Founded");
			}
			break;
		case 2:
			String name=sc.next();
			for(Employee1 e:employees) {
				if(e.name.equalsIgnoreCase(name)) {
					found=true;
					System.out.println(e.toString()+"\n Founed");
					break;
				}
			}
			if(!found) {
				System.out.println("Not Founded");
			}
			break;
		default:
			System.out.println("Sorry Wrong Choice");
			break;
		}
	}
}
