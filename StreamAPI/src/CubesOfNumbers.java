import java.util.function.Predicate;
import java.util.stream.IntStream;

public class CubesOfNumbers {
	public static void main(String[] args) {
		int sum = 0;
		//1 Functional way print numbers 1 to 20.	
		IntStream.range(1, 21).forEach(n -> System.out.println(n));

		//2 divisible by 3 from 1 to 20
		IntStream.range(1, 21).filter(n -> n % 3 == 0).forEach(n -> System.out.println(n));

		//3 print squares from 1 to 10.
		IntStream.range(1, 11).map(n -> n * n).forEach(n -> System.out.println(n));

		//4 sum of odd numbers
		sum = IntStream.range(1, 20).filter(n -> n % 2 != 0).sum();
		System.out.println(sum);

		//5 print cubes of numbers
		IntStream.range(1, 10).map(n -> n * n * n).forEach(n -> System.out.println(n));

		//6 print sum of square even number
		sum = IntStream.range(1, 10).filter(n -> n % 2 == 0).map(n -> n * n).sum();
		System.out.println(sum);

		//7 divisible by 3
		IntStream.range(1, 21).filter(n -> n % 3 == 0).forEach(n -> System.out.println(n));

		//8 print even numbers
		IntStream.range(1, 21).filter(n -> n % 2 == 0).forEach(n -> System.out.println(n));

		//9 print odd numbers
		IntStream.range(1, 21).filter(n -> n % 2 != 0).forEach(n -> System.out.println(n));

		//10print sum of even numbers
		sum = IntStream.range(1, 21).filter(n -> n % 2 == 0).sum();
		System.out.println("sum of even:" + sum);

		//11print sum of odd numbers
		sum = IntStream.range(1, 21).filter(n -> n % 2 != 0).sum();
		System.out.println("sum of odd:" + sum);
		
		

		
		
	}
}


