package Inheritance;

public class CurrentAccount {

	public static void main(String[] args) {
		SavingsAccount s1 = new SavingsAccount("srikanth",27, 24550);
		SavingsAccount s2 = new SavingsAccount("rohit", 26,24550);
		SavingsAccount s3 = new SavingsAccount("avinash", 26,24550);
		s1.show();
		s2.show();
		s3.show();
	}

}
