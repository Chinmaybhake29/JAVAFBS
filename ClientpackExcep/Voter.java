package ClientpackExcep;


public class Voter {
	int age;

	public Voter(int a) {
		this.age = a;
	}

	public void validate() throws AgedException {
		if (this.age < 18) {
			throw new AgedException();
		} else {
			System.out.println("Ja tuze voter card de diya");
		}
	}
} //class of votes ends here

