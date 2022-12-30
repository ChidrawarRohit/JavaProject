import java.util.ArrayList;

public class Dmart {

	public static void main(String[] args) {
		ArrayList<Product> Dmart = new ArrayList<Product>();	
		Product Walnut = new Product(12,"walnut",300);
		Product cashew = new Product(14,"cashew",250);
		Product almond = new Product(16,"almond",310);
		Dmart.add(Walnut);
		Dmart.add(cashew);
		Dmart.add(almond);
		
		for (Product product:Dmart) {
			System.out.println(Dmart);
		}	
	}
}
