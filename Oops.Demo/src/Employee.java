
public class Employee {
	
		String name;
		double salary;

		void accept(String e_name, double e_salary) {

			this.name = e_name;
			this.salary = e_salary;
		}
		
		void show() {
	System.out.println("Employee name :" + this.name);
    System.out.println("Employee salary:" + this.salary);
		}


	}

