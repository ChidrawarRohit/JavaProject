package Inheritance;

public class SavingsAccount extends Account {
	double salary;
	private int age;
	
	private SavingsAccount() {
		
	}

	public SavingsAccount(String name, int age , double salary) {
		this.setName(name);
		this.setAge(age);
		this.salary = salary;
	}
	

	void show()  {
		System.out.println(this.getName() + " " + this.getAge() + " " + this.salary );
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
