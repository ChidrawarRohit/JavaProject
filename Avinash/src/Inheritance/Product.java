package Inheritance;

public class Product implements Taxable {
	String name;
	double price;
	public static final double TAX = 2;
	public Product()  {

	}
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public void getTax() {
		System.out.println(this.name+" " +this.price + " " + (price+TAX));
	}
}