
public class EmployeeConstructor {
	//variables
		int id;
		String name;
		double Salary;

		//Constructor (to initialize)
		
		public EmployeeConstructor(int id, String name, double salary) {
		
			    this.id = id;
				this.name = name;
				this.Salary = Salary;
		}
		// methods

		void show() {
			System.out.println("employee id :" + this.id);		
			System.out.println("employee name :" + this.name);
			System.out.println("employee Salary:" + this.Salary);
		}


	}

