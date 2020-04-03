interface figure
{
	abstract void area();
}

class Rectangle implements figure
{
	double length;
	double width;
	Rectangle(double l, double w){
		length = l;
		width = w;
	}
	public void area(){
		System.out.println("Area of rectangle = " + length*width);
	}
}

class Square implements figure
{
	double length;
	Square(double length){
		this.length = length;
	}
	public void area(){
		System.out.println("Area of square = " + length*length);
	}
}

class InterfacePolymorphism
{
	public static void main(String args[])
	{
		figure obj;
		Rectangle r = new Rectangle(6,8);
		Square s = new Square(4);
		obj = r;
		obj.area();
		obj = s;
		obj.area();
	}
}