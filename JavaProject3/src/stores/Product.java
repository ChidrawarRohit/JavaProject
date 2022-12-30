package stores;

public class Product {
	private String name;
	private int price;

	public Product()  {

	}
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	void show()  {
		System.out.println(price);
	}
}