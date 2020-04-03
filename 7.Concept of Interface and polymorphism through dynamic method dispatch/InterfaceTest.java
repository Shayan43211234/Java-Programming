interface test
{
	final int a = 10;
	static void display(){
		System.out.println("Experiment on static method : " + a);
	} 
}

class InterfaceTest implements test
{
	public static void main(String[] args) {
		test.display();
	}
}