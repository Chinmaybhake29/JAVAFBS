package Collection;

import java.util.ArrayList;
import java.util.List;

public class TestCollection1 
{
	public static void main(String[] args) 
	{
		List<String>namelList=new ArrayList<String>();
		namelList.add("Virat");
		namelList.add("Surya");
		namelList.add("Shiva");
		namelList.add("Mass");
		for (String name : namelList) {
			System.out.println(" "+name);
		}
	}
}
