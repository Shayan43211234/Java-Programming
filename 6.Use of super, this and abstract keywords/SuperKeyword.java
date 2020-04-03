class Box
{
	double length;
	double width;
	double height;

	Box(){
		length = width = height = 1;
	}
	Box(double side, double h){
		length = width = side;
		height = h;
	}
	Box(double l, double w, double h){
		length = l;
		width = w;
		height = h;
	}

	void volume(){
		System.out.println(length*width*height);
	}
}

class Rectangle extends Box
{
	Rectangle(double l, double w, double h){
		super(l, w, h);
	}

	void volume(){
		System.out.println("Volume of the rectangle = ");
		super.volume();
	}
}

class Square extends Box
{
	Square(double s, double h){
		super(s, h);
	}

	void volume(){
		System.out.println("Volume of the square = ");
		super.volume();
	}
}

class MainClass
{
	public static void main(String[] args) {
		Rectangle ob1 = new Rectangle(6,3,4);
		ob1.volume();

		Square ob2 = new Square(3,5);
		ob2.volume();
	}
}