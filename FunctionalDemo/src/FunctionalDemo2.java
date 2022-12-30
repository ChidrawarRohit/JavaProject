import java.util.function.Function;

public class FunctionalDemo2 {

	public static void main(String[] args) {
		Function<Integer,Integer> half=(a) -> a/2;
		System.out.println(half.apply(10));
	}

}
