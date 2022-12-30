import java.util.function.Function;

public class Cube {

	public static void main(String[] args) {
		Function<Integer,Integer> cube = (a) -> a*a*a;
		System.out.println(cube.apply(10));
		System.out.println(cube.apply(20));
		System.out.println(cube.apply(30));


	}

}
