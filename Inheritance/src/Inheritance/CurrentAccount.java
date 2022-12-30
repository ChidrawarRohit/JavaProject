package Inheritance;

public class CurrentAccount {

	public static void main(String[] args) {
		SavingsAccount s1 = new SavingsAccount("srikanth",25,27000 );
		SavingsAccount s2 = new SavingsAccount("avinash",26,24550 );
		SavingsAccount s3 = new SavingsAccount("rohit",26,26550 );
		s1.show();
		s2.show();
		s3.show();
	}

}
