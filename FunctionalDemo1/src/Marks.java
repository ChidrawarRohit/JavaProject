import java.util.function.Predicate;

public class Marks {

	public static void main(String[] args) {
		Predicate<Integer> pass = (a) -> a >= 50;
		System.out.println(pass.test(50));

	}

}
