import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Palindrome {

	public static void main(String[] args) {
		Function<Integer,Integer> reversenumber  = n -> Integer.parseInt(new StringBuffer(n + "").reverse().toString());
		IntPredicate isPalindrome = n ->n == reversenumber.apply(n);
		System.out.println(isPalindrome.test(121));

		IntStream.range(300, 1001).filter(isPalindrome).forEach(System.out::println);

	}

}
