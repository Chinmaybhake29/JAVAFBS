package ClientpackExcep;

public class AgedException extends Exception {
	@Override
	public String toString() {
		return "Your age is not eligible for vote";
	}
}
