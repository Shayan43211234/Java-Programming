class PalindromeTest
{
	public static void main(String args[])
	{
		String rev = "";
		String str = args[0];
		int l = str.length();
		for(int i=l-1; i>=0; i--)
			rev = rev + str.charAt(i);
		if(str.equals(rev))
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome");
	}
}