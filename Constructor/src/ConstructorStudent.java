
public class ConstructorStudent {
	//variables
	int id;
	String name;
	double marks;

	//Constructor (to initialize)
	
	public ConstructorStudent(int id, String name, double marks) {
	
		    this.id = id;
			this.name = name;
			this.marks = marks;
	}
	// methods

	void show() {
		System.out.println("Student id :" + this.id);		
		System.out.println("Student name :" + this.name);
		System.out.println("Student marks:" + this.marks);
	}


}

