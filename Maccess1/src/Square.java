
public class Square {
	public static void main(String[] args) {
		printnumber();
	}
	public static void printnumber() {
		int sum = 0;
		for(int i = 1; i<=10; i++) {
			sum = sum+i*i;
		}
		System.out.println(sum);
	}
}

