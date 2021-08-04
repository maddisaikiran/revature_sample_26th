package mypack4;
public class Shape {

	public static void main(String[] args) {
		Rectangle t = new Rectangle();
		t.area(10, 20);
		Square s= new Square();
		s.area(10);
		Trapezium z= new Trapezium();
		z.area(10, 20, 30);
	}
	}
	class Rectangle extends Shape
	{ 
		public void area(double height, double width)
		{
		double area1=height*width;
		System.out.println("Area of rectangle is: "+area1);
		}
	}
	class Square extends Shape
	{
		public void area(double side)
		{
		double area2=side*side;
		System.out.println("Area of square is: "+area2);
		}
		}
	class Trapezium extends Shape
	{
		public void area(double height, double width, double side)
		{
		double area3=((side+width)/2)*height;
		System.out.println("Area of trapezium is: "+area3);
		}

	}

