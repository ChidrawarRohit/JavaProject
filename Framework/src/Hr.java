import java.util.ArrayList;

public class Hr {

	public static void main(String[] args) {

		ArrayList<Employee> Hr = new ArrayList<Employee>();
		Employee e1 = new Employee(12,"pavan",20000);
		Employee e2 = new Employee(13,"sandeep",22000);
		Employee e3 = new Employee(14,"narendar",23000);
		
		Hr.add(e1);
		Hr.add(e2);
		Hr.add(e3);
		
		for(Employee employee:Hr) {
			System.out.println(employee);
		}

	}
}
