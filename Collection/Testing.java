package Collection;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

class Worker implements Comparable<Worker>
{
	int id;
	String name;
	double salary;
	
	public Worker() {
		// TODO Auto-generated constructor stub
	}

	public Worker(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Worker [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Worker o) {
		return Integer.compare(o.id, this.id);
	}
	
}
public class Testing 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Worker>workers=new ArrayList<Worker>();
		workers.add(new Worker(1, "Chinmay", 780000));
		workers.add(new Worker(2,"Tanamy",89000));
		workers.add(new Worker(3, "Rohit", 56000));
		
		int choice=0;
		boolean found=false;
		
		do {
			System.out.println("\n1. Search By id\n2. Search By name\n3. Sort By Id");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch (choice) 
			{
			case 1:
				System.out.println("Enter the worker ID");
				int id=sc.nextInt();
				for (Worker worker : workers) {
					if(worker.id==id) {
						System.out.println(" Founded "+worker);
						found=true;
					}
				}
				if(!found) {
					System.out.println("Sorry No id found");
				}
				break;
			case 2:
				System.out.println("Enter the worker name");
				String name=sc.next();
				for (Worker worker : workers) {
					if(worker.name.equalsIgnoreCase(name)) {
						System.out.println(" Found "+worker);
						found=true;
					}
				}
				if(!found) {
					System.out.println("Name Not founed");
				}
			case 3:
				TreeSet<Worker>workers2=new TreeSet<Worker>();
				workers2.addAll(workers);
				System.out.println("Sorted Workers...");
				for (Worker worker : workers2) {
					System.out.println(worker);
				}
			case 4:
				System.out.println("Exiting.......");
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
		} while (choice!=4);
	}
}
