
public class Employee {
int id;
String name;
double salary;
public Employee()  {
	
}
public Employee(int id, String name, double salary) {
	this.id = id;
	this.name = name;
	this.salary = salary;
}
void show() {
	System.out.println(this.id + " " + this.name + " " + this.salary);
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}
}
