
public class Triangle extends Shape {

	public Triangle() {
	}
	int area;
	int base;
	int height;

	public Triangle(int area, int base , int height) {
		this.area = area;
		this.base = base;
		this.height = height;
	}

	@Override
	void area() {
		this.result = this.area * this.base * this.height;
	}

}
