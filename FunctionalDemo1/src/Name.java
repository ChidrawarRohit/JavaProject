import java.util.function.Predicate;

public class Name {
	//Functional Interface Types--4types
	//1.Predicate--boolean result
	public static void main(String[] args) {
		Predicate<String> checkLength=str->str.length()>6;
		//checking if Name of String6--true--else--false;
		System.out.println(checkLength.test("ROHIT"));
	}
}


