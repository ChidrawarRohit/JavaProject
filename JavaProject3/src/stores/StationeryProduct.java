package stores;

public class StationeryProduct extends Product {
	private String name;
	private int price;

	public StationeryProduct()  {

	}

	public StationeryProduct(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	void show()  {
		System.out.println(this.name + " " + this.price);
	}
}