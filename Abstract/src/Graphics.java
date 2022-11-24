
public class Graphics {

	public static void main(String[] args) {
		Circle c1 = new Circle (50);
		c1.area();
		c1.show();

		Rectangle r1 = new Rectangle (100,200);
		r1.area();
		r1.show();

		Square s1 = new Square (50,100,150);
		s1.area();
		s1.show();

		Triangle t1 = new Triangle (20,40,60);
		t1.area();
		t1.show();

	}
}