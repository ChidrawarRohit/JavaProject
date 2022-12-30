
public class Account {
	int id;
	String name;
	double balance;

	static String bankname;
	{
	}
	public Account(int id, String name, double balance) {
		super();
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
	void show()  {
		System.out.println("id" + " "  + name + " " + balance);
	}
	static void setbankname(String bankname) {
		Account.bankname=bankname;
	}
	static String getBankName() {
		return Account.bankname;
	}
}




