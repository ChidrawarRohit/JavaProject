import java.util.function.Function;

public class Person1 {
	//Functional Interface Types--4types
	//2.Functional--both input-and output
	public static void main(String[] args) {
		Function<Integer,String> getInt=t->t*10+" Data multiplied by 10";
		System.out.println(getInt.apply(2));
	}

}
