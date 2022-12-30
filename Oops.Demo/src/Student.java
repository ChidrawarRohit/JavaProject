
public class Student {

	String name;
	double marks;

	void accept(String s_name, double s_marks) {

		this.name = s_name;
		this.marks = s_marks;
	}

	void show() {
		System.out.println("Student name :" + this.name);
		System.out.println("Student marks:" + this.marks);
	}


}

