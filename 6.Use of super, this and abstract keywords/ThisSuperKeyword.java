class Box
{
	double length;
	double width;

	Box(){
		length=width=1;
	}
	Box(double length, double width){
		this.length = length;
		this.width = width;
	}
	void area(){
		System.out.println(length*width);
	}
}

class Rectangle extends Box
{
	Rectangle(double length, double width){
		super(length, width);
	}
	void area(){
		System.out.println("Arrea of the rectangle = ");
		super.area();
	}
}

class Square extends Box
{
	Square(double side){
		super.length = super.width = side;
	}
	void area(){
		System.out.println("Arrea of the square = ");
		super.area();
	}
}

class MainBox
{
	public static void main(String args[])
	{
		Rectangle r = new Rectangle(6,9);
		r.area();

		Square s = new Square(5);
		s.area();
	}
}