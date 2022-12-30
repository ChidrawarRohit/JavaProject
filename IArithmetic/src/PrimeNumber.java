
public class PrimeNumber {
	public static boolean PrimeNumber(int a) {
		int num = 5;
		int count = 0;
        if (num > 1) {
			for (int i =1; i <= num; i++);
			{
				if (num % num == 0)
					count++;
			}
			if(count == 1)  {
				System.out.println("prime number");
			} else {
				System.out.println(" not a prime number");
			}
		}
		return true;
	}
}

