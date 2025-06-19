package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Mobile implements Comparable<Mobile>
{
	int imiei_no;
	String brand;
	double price;
	String model;
	
	public Mobile() {
		// TODO Auto-generated constructor stub
	}

	public Mobile(int imiei_no, String brand, double price, String model) {
		super();
		this.imiei_no = imiei_no;
		this.brand = brand;
		this.price = price;
		this.model = model;
	}
	
	int getImiei_no() {
		return imiei_no;
	}

	void setImiei_no(int imiei_no) {
		this.imiei_no = imiei_no;
	}

	String getBrand() {
		return brand;
	}

	void setBrand(String brand) {
		this.brand = brand;
	}

	double getPrice() {
		return price;
	}

	void setPrice(double price) {
		this.price = price;
	}

	String getModel() {
		return model;
	}

	void setModel(String model) {
		this.model = model;
	}

	@Override
	public int compareTo(Mobile o) {
		
		return this.imiei_no-o.imiei_no;
	}

	@Override
	public String toString() {
		return "Mobile "
				+ "[imiei_no=" + imiei_no 
				+ ", brand=" + brand 
				+ ", " + "price=" + price + ""
				+ ", model=" + model + "]";
	}
}
class MobileCompare implements Comparator<Mobile>
{

	@Override
	public int compare(Mobile o1, Mobile o2) {
		
		return o1.getBrand().compareTo(o2.getBrand());
	}
	
}
public class TestMobileCollection {
	public static void main(String[] args) {
		List<Mobile>mobiles=new ArrayList<Mobile>();
		mobiles.add(new Mobile(101, "Samsung", 25000, "S Series"));
		mobiles.add(new Mobile(103, "Apple", 56000, "IPhone 16"));
		mobiles.add(new Mobile(102, "Noika", 6700, "Lumia"));
		mobiles.add(new Mobile(104, "Vivo", 9000, "S11"));
		
		System.out.println("Sort Bt IMEI NUMBER");
		Collections.sort(mobiles);
		System.out.println(mobiles);
		
		System.out.println("Sort By Mobile Brand");
		MobileCompare mobileCompare=new MobileCompare();
		Collections.sort(mobiles,mobileCompare);
		System.out.println(mobiles);
		
	}
}
