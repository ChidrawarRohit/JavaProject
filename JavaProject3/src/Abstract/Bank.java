package Abstract;

public class Bank {

	public static void main(String[] args) {
		SavingsAcc sa= new SavingsAcc (5 , 100000 , 1);
		sa.interest();
		sa.show();


		CurrentAcc ca= new CurrentAcc (4 , 100000 , 1);
		sa.interest();
		ca.show();

	}
}