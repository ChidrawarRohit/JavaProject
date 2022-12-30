import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionalDemo4 {

	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> product = (a,b) -> a*b;
		System.out.println(product.apply(10,20));
	}

}
