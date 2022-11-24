
public class collegeConstructor {

	public static void main(String[] args) {
		//create student marks

		ConstructorStudent s1 = new ConstructorStudent(75,"Srikanth",95);

		ConstructorStudent s2 = new ConstructorStudent(85,"Rohit",90);

		ConstructorStudent s3 = new ConstructorStudent(55,"Avinash",85);
		
       //call method using student object
		
		s1.show();
		s2.show();
		s3.show();
	}



}


