import java.util.function.Predicate;

public class Major {

	public static void main(String[] args) {
		Predicate<Integer> age = (a) -> a >=18 ;
		System.out.println(age.test(36));
	}

}
