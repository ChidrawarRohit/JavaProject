import java.util.function.Function;

public class FunctionalDemo1 {

	public static void main(String[] args) {
		Function<Integer,Integer> cube=(a) -> a*a*a;
		System.out.println(cube.apply(10));
	}

}
