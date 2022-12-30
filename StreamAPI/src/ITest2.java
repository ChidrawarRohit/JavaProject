import java.util.Scanner;

public class ITest2 {
	final static int MAX_N = 10;
 static int lcm(int a, int b) {
		while (b != 0) {
			int t = a;//1
			a = b
					;//2
			b = t % b;
		}
		return a; //loop exist
	}
	public static void main(String[] args) {
		int r = 1;
		for (int i = 1; i <= MAX_N; i++) {
			int Gcd = lcm(i, r);
			r = r / Gcd * i;
		}
		System.out.println(r);
	} 
}

