
public class Circle extends Shape {

	int radius;

	public Circle()  {
	}

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	void area() {
		this.result = 3.14159 * this.radius * this.radius;

	}

}
