
public class OpenClosedPrinciple {
	public static class Circle implements Shape{
		double radius;
		public Circle(double radius) {
			this.radius=radius;
		}
		@Override
		public double area() {
			// TODO Auto-generated method stub
			return Math.PI*radius*radius;
		}
		
	}
	public static class Square implements Shape{
		double side;
		public Square(double side) {
			this.side=side;
		}
		@Override
		public double area() {
			// TODO Auto-generated method stub
			return side*side;
		}
		
	}
	public static class AreaCalculator {
		public double calcArea(Shape shape) {
			return shape.area();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle(55.0);
		Square s=new Square(10.23);
		AreaCalculator ac=new AreaCalculator();
		System.out.println(ac.calcArea(c));
		System.out.println(ac.calcArea(s));
		

		
	}

}
