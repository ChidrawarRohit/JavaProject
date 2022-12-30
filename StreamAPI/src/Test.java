import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		List<Integer> list1 = list.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println("list : "+list);
		System.out.println("listl: "+list1);
	}

}
