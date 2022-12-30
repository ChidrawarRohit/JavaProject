import java.util.function.BiFunction;
import java.util.function.Function;

public class Calculator {

	public static void main(String[] args) {
	BiFunction<Integer,Integer,Integer> calculate = (a,b) -> a*a+b*b;
		System.out.println(calculate.apply(10,20));
	}

}
