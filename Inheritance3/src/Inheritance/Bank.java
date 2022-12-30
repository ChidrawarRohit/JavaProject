package Inheritance;

public class Bank {

	public static void main(String[] args) {
		SalaryAccount s1 = new SalaryAccount("srikanth",21000,24550);
		SalaryAccount s2 = new SalaryAccount("rohit",22000, 24550);
		SalaryAccount s3 = new SalaryAccount("avinash",23500, 24550);
		s1.show();
		s2.show();
		s3.show();
	}

}
