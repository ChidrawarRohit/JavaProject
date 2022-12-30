
public class AbudantNumber {

	public static void main(String[] args) 
	{
		int result = 0;
		int a = 16;
		for (int i =1; i<a; i++) {
			if (a % i==0)
				result=result+i;
		}

		if (result==a) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
}