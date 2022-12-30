import java.util.function.Supplier;

public class Person2 {
	//Functional Interface Types--4types
	//2.Supplier--only- output
	public static void main(String[] args) {
		Supplier<Double> getRandomDouble=()->Math.random();
		System.out.println(getRandomDouble.get()); //no ootput

	}

}
