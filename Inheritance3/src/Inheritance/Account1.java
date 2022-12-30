package Inheritance;

public class Account1 {
	private String accountname;
	private int accountnumber;
	
	public Account1()  {
		super();
		
	}

	public Account1(String accountname, int accountnumber) {
		super();
		this.accountname = accountname;
		this.accountnumber = accountnumber;
	
}
void show()  {
	System.out.println(this.accountname + " " + this.accountnumber);
}

public String getName() {
	return accountname;
}

public void setName(String name) {
	this.accountname = name;
}

public int getAccountnumber() {
	return accountnumber;
}

public void setAccountnumber(int accountnumber) {
	this.accountnumber = accountnumber;
}
}