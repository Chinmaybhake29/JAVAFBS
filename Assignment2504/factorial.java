package Assignment2504;

public class factorial {
	public static int factorial(final int n)
	{
		int fact=1;
		
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		factorial f=new factorial();
		int result=factorial(5);
		System.out.println(result);
	}
}
