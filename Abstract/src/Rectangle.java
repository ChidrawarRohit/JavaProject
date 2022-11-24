
public class Rectangle extends Shape {

	int length;
	int breadth;

	public Rectangle() {

	}

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	@Override
	void area() {
		this.result = this.length * this.breadth;

	}

}
