class Outer
{
	int outer_var = 8;
	void display(){
		Inner ob = new Inner();
		ob.show();
		System.out.println(outer_var);
	}
	class Inner
	{
		int inner_var = 2018;
		void show(){
			System.out.println(inner_var);
		}
	}
}

class Main
{
	public static void main(String args[])
	{
		Outer ob1 = new Outer();
		Outer.Inner ob2 = ob1.new Inner();
		
		ob1.display();
		ob2.show();
	}
}