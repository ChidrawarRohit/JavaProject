import java.util.function.Function;

public class FunctionalDemo3 {

	public static void main(String[] args) {
		Function<Integer,Integer> twice = (a) -> 2*a;
		System.out.println(twice.apply(20));
	}

}
