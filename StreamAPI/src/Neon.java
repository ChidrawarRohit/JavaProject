import java.util.Scanner;

public class Neon { 

	public static void main(String[] args) {
		//number = 9square = 9*9=81 sum =8+1=9 sum == number//9 == 9

		Scanner sc = new Scanner(System.in);
		System.out.println("Input : ");
		int number = sc.nextInt();//9
		int sq = number*number; //9*9=81
		int sum = 0;
		while(sq > 0)  {
			int mod = sq % 10;
			sum = sum + mod;
			sq = sq / 10;
		}
		if(sum == number)  { //9==9 true
			System.out.println("Neon number  = " +number);	
		} else {
			System.out.println("Not a Neon number = " +number);	

		}
	}
}








