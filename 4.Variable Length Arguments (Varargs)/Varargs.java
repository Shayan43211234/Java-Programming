class Args
{
	void display(String name, int ...marks)
	{
		int sum = 0;
		for(int x : marks)
			sum = sum+x;
		System.out.println("My name is " + name + ".\nTotal mark = " + sum + ".\n");
	}
}

class MainArgs
{
	public static void main(String args[])
	{
		Args ob = new Args();
		ob.display("Mr X");
		ob.display("Ram", 50,20);
		ob.display("Shayan", 50,20,15);
	}
}