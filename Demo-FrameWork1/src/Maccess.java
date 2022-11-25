import java.util.ArrayList;

public class Maccess {

	public static void main(String[] args) {
		ArrayList List = new ArrayList();
		List.add(10);
		List.add("welcome");
		List.add(true);
		System.out.println(List);
		System.out.println(List.contains(10));
		
		//List.clear();
		//System.out.println(List);
		System.out.println(List.isEmpty());
	}
}
