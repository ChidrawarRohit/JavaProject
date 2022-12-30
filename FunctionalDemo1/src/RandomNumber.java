import java.util.function.Supplier;

public class RandomNumber {

	public static void main(String[] args) {
		Supplier<Double> random = () ->Math.random();
		System.out.println(random.get());
		System.out.println(random.get());
		System.out.println(random.get());

	}

}
