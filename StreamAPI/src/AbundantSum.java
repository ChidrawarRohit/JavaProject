import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class AbundantSum {

	public static void main(String[] args) {
		int n = 10;
		int factsum;
		
		factsum = IntStream.range(1, n).filter((i)-> n % i == 0).sum();
		System.out.println(factsum);
		
		//AbundantNumber
		//function
				
		
	}

}
