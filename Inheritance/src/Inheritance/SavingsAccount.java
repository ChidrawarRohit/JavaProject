package Inheritance;

public class SavingsAccount extends Account {
	double salary;

	public SavingsAccount()  {

	}
	public SavingsAccount(String name,int id,double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	void show() {
		System.out.println(this.name + " " + this.id + " " + this.salary);
	}


}


