
public class PerfectNumber {

	public static void main(String[] args) {
		int result = 0;
		int b = 6;
		for(int i = 1; i<b; i++) {
			if(b % i == 0)
				result=result+i;
		}
		if(result==b) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
}
