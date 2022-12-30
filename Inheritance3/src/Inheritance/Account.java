package Inheritance;

public class Account {
	
	private String name;
	private int age;
	
	public Account()  {
		super();
		
	}

	public Account(String name, int id) {
		super();
		this.setName(name);
		this.setAge(age);
	}
	void show() {
		System.out.println(this.name + " " + this.age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

}
