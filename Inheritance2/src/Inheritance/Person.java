
package Inheritance;

public class Person {
	private String setName;
	private int setAge;

	public Person() {
		super();		
	}

	public Person(String name, int age) {
		super();
		this.setName = name;
		this.setAge = age;
	} 
	void show()  {
		System.out.println(this.setName + " " + this.setAge);
	}
	public String getName()  {
		return 	setName;
	}

	public void setName(String name) {
		this.setName = name;
	}

	public int getAge()  {
		return setAge;
	}

	public void setAge(int age)  {
		this.setAge = age;
	}
}