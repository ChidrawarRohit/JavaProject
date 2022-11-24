
public class Square extends Shape {

	public Square() {
	}
	int length;
	int width;
	int height;


	public Square(int length, int width , int height) {
		this.length = length;
		this.width = width;
		this.height = height;


	}
	@Override
	void area() {
		this.result = this.length * this.width * this.height;
	}

}
