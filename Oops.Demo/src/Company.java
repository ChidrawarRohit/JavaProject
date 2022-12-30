
public class Company {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.accept("Srikanth", 11000);

		Employee e2=new Employee();
		e2.accept("Rohit", 11000);

		Employee e3=new Employee();
		e3.accept("Avinash", 11000);

		e1.show();
		e2.show();
		e3.show();
	}

}


