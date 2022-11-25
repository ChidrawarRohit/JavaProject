import java.util.LinkedList;

public class PClass {

	public static void main(String[] args) {
		LinkedList List = new LinkedList();

		List.add(10);
		List.add(50);
		List.add("hello");
		List.add(true);

		System.out.println(List);
		List.addFirst("Rohit");
		System.out.println(List);
		List.set(2,"Rakesh");
		System.out.println(List);
		List.add(4,"rajkiran");
		System.out.println(List);

		System.out.println(List.size());
		System.out.println(List.get(3));
		System.out.println(List.contains(15));
		System.out.println(List.contains("Manish"));
		List.clear();
		System.out.println(List);

	}

}
