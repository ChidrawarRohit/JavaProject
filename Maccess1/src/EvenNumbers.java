
public class EvenNumbers {

	public static void main(String[] args) {
		printnumber();
	}
	public static void printnumber() {
		int sum =0;
		for (int i=1; i<=10; i++) {
			if(i% 2==0)
				sum = sum +i;
		}
		System.out.println(sum);
	}
}
