
public class Account {
	
	String name;
	double balance;
	
	void accept(String A_name, double A_balance) {

		this.name = A_name;
		this.balance = A_balance;
	}
	void show() {
		System.out.println("Account name :" + this.name);
		System.out.println("Account balance:" + this.balance);
	}


}
