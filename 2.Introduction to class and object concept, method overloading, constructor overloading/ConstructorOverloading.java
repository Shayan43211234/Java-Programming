class Box
{
	double length;
	double breadth;
	double height;
	
	Box(){
		length = breadth = height = 1;
	}
	Box(double dia){
		length = breadth = height = dia;
	}
	Box(double l, double b, double h){
		length = l;
		breadth = b;
		height = h;
	}
	
	double volume(){
		return length*breadth*height;
	}
}

class MainBox2
{
	public static void main(String args[])
	{
		Box ob1 = new Box();
		Box ob2 = new Box(2);
		Box ob3 = new Box(2, 3, 1);
		System.out.println("Volume of 'no parameter' is: " + ob1.volume());
		System.out.println("Volume of 'one parameter' is: " + ob2.volume());
		System.out.println("Volume of 'three parameter' is: " + ob3.volume());
	}
}