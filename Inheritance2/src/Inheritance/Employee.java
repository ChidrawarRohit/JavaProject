package Inheritance;

public class Employee extends Person {
	private Double Salary;
	
	public Employee (String name, int age , double salary) {
		this.setName(name);
		this.setAge(age);
	}
	void show() {
		System.out.println(this.getName() + " " + this.getAge() + " " + this.Salary);
	}
}
