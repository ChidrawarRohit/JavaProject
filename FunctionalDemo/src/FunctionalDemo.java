import java.util.function.Function;

public class FunctionalDemo {

	public static void main(String[] args) {
		Function<Integer,Integer>square=(a) -> a * a;
		System.out.println(square.apply(20));
	}

}
