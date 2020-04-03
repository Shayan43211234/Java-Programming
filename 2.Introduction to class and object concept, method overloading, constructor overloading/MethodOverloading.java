class Box
{
	double length;
	double breadth;
	double height;
	
	double volume(){
		length = breadth = height = 1;
		return length*height*breadth;
	}
	double volume(double dia){
		length = breadth = height = dia;
		return length*height*breadth;
	}
	double volume(double l, double b, double h){
		length = l;
		breadth = b;
		height = h;
		return length*breadth*height;
	}
}
public class MethodOverloading
{
	public static void main(String args[])
	{
		Box ob = new Box();
		System.out.println("Volume of 'no parameter' is: " + ob.volume());
		System.out.println("Volume of 'one parameter' is: " + ob.volume(2));
		System.out.println("Volume of 'three parameter' is: " + ob.volume(2,3,1));
	}
}