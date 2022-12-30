import java.util.function.Function;
import java.util.function.Predicate;

public class OddNumber {

	public static void main(String[] args) {
		Predicate<Integer> isOdd = (a) -> a % 2 != 0;
		System.out.println(isOdd.test(1));
	}

}
