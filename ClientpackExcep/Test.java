package ClientpackExcep;

public class Test {
	public static void main(String[] args) {
		int a =Integer.parseInt(args[0]);
		
		Voter v=new Voter(a);
		
		try {
			v.validate();
		} catch (AgedException e) {
			System.out.println("Main wala hai");
			System.out.println(e);
		} finally {
			System.out.println("Chup be!");
		}
	}
}
