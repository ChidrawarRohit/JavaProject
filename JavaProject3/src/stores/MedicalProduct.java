package stores;

public class MedicalProduct extends Product {
	private String name;
	private int price;
	private int ExpiryYear;
	private int ExpiryMonth;

	public MedicalProduct()  {

	}

	public MedicalProduct(String name, int price, int expiryYear, int expiryMonth) {
		super();
		this.name = name;
		this.price = price;
		ExpiryYear = expiryYear;
		ExpiryMonth = expiryMonth;
	}
	void show()  {
		System.out.println(this.name + " " + this.price + " " + this.ExpiryYear + " " + this.ExpiryMonth);
	}
}


