import java.util.ArrayList;
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList fruitList = new ArrayList();
		fruitList.add("mango");
		fruitList.add("watermelon");
		fruitList.add("papaya");

		System.out.println(fruitList); //mango,watermelon,papaya

		System.out.println("Number of elements in array list:"+fruitList.size());

		//remove
		fruitList.remove(2);
		fruitList.remove("papaya , watermelon");
		System.out.println("After removing:"+ fruitList);		
	}
}


