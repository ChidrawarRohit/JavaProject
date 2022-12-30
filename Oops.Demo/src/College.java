
public class College {

	public static void main(String[] args) {

		Student s1= new Student();
		s1.accept("Srikanth", 65);

		Student s2=  new Student();
		s2.accept("Rohit", 75);


		Student s3=  new Student();
		s3.accept("Avinash", 85);


		s1.show();
		s2.show();
		s3.show();
	}

}


