class Test
{
	static int a;	//It is accessable by class name.
	final int b = 8;//It's value can not be change.
	static final int c = 80;
}

class Main
{
	public static void main(String[] args)
	{
		Test.a = 75;
		System.out.println("\nValue of A variable = " + Test.a);
		
		Test ob = new Test();
		System.out.println("Value of B variable = " + ob.b);

		System.out.println("Value of C variable = " + Test.c);
	}
}