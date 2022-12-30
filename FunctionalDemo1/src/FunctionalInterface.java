import java.util.function.Predicate;

public class FunctionalInterface {
	//Functional Interface Types--4types
	//1.Predicate--boolean result
	public static void main(String[] args) {
		Predicate<String> checkLength=str->str.length()>5;
		//checking if length of String5--true--else--false;
		System.out.println(checkLength.test("Radhakrishna"));
	}

}

 