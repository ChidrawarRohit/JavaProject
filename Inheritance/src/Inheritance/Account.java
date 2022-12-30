package Inheritance;
public class Account {

	int id;
	String name;


	public Account()  {

	}

	public Account(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	void show() {
		System.out.println(this.name + "" + this.id);
	}
}
