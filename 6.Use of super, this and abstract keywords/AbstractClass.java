abstract class Box
{
	double length;
	double width;

	Box(){
		length = width = 1;
	}
	Box(double l, double w){
		length = l;
		width = w;
	}
	Box(double side){
		length = width = side;
	}

	abstract void area();
}

class Rectangle extends Box
{
	Rectangle(double l, double w){
		super(l, w);
	}
	void area(){
		System.out.println("Area of rectangle = " + length*width);
	}
}

class Square extends Box
{
	Square(double side){
		super(side);
	}
	void area(){
		System.out.println("Area of square = " + length*width);
	}
}

class MainBox
{
	public static void main(String[] args)
	{
		Rectangle r = new Rectangle(4,6);
		r.area();

		Square s = new Square(4);
		s.area();
	}
}