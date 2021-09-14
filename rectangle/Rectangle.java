import java.util.*;

public class Rectangle {
	private double length;
	private double width;

	public Rectangle() {
		length = 1.0;
		width = 1.0;
	}

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public String toString() {
		return length + " x " + width + "\t- Area: " 
			+ getArea() + "\t- Perimeter: " + getPerimeter();
	}

	public void setLength(double length) {
		this.length = length;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public double getArea() {
		return length * width;
	}

	public double getPerimeter() {
		return (2 * width) + (2 * length);
	}

	public static void main(String args[]) {
		List<Rectangle> rectangles = new ArrayList<Rectangle>();

		rectangles.add(new Rectangle());
		rectangles.add(new Rectangle(3, 5));
		rectangles.add(new Rectangle(5, 5));

		rectangles.forEach(rectangle -> System.out.println(rectangle));
	}
}

