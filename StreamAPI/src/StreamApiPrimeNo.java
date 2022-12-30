import java.util.stream.IntStream;

public class StreamApiPrimeNo {

	private static boolean isPrime(int number)  {

		return IntStream.range(2, number).noneMatch(n -> number % n == 0);
	}
	public static void main(String[] args) {
		if (isPrime(11))  {
			System.out.println("is Prime Number");
		}
		else  {
			System.out.println("Not prime number");
		}
	}
}
