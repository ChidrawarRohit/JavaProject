package Inheritance;

public class SalaryAccount {
	double salary;
	private int incentive;
	private String getName;
	
		
public SalaryAccount(String getName, int incentive, double salary) {
		super();
		this.salary = salary;
		this.incentive = incentive;
		this.getName = getName;
	}

void show() {
	System.out.println(this.getName + " " + this.getSalary()  + " " +  this.incentive);
		
	}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public int getIncentive() {
	return incentive;
}
public void setIncentive(int incentive) {
	this.incentive = incentive;
}
}
