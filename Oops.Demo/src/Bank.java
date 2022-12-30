
public class Bank {
	public static void main (String [] args) {
	
		Account A1=new Account();
		A1.accept("Srikanth", 11000);

		Account A2=new Account();
		A2.accept("Rohit", 12000);

		Account A3=new Account();
		A3.accept("Avinash", 13000);

		A1.show();
		A2.show();
		A3.show();
	}
	}

