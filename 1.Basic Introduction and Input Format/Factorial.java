import java.util.Scanner;

class Factorial
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int fact = 1;
		System.out.println("Enter a number: ");
		int n = scan.nextInt();
		for(int i=1; i<=n; i++)
			fact = fact*i;
		System.out.println("Factorial of the number is: " + fact);
		scan.close();
	}
}