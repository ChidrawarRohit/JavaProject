
public class Product {
	int id;
	String name;
	double price;
	public Product()  {
		
	}
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	void show()  {
		System.out.println(this.id + this.name + this.price);
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
}

