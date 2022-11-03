package iarithmetic;

public class Rectangle {

	int length;
	int breadth;
	
	public Rectangle()  {	
	}
	public Rectangle(int length , int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	public void show()  {
		System.out.println(this.length*this.breadth);
	}
}
