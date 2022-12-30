import java.util.Scanner;

public class DeficientNumber {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int total=n;
		int sum=0;
		for(int i = 1; i<n; i++) {
			if(n % i == 0)
				sum=sum+i;
		}
		if(sum<total)
			System.out.println("True");
		{ if(sum>total)
			System.out.println("False");
		}
	}
}

