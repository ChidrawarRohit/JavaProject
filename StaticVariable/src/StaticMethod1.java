
public class StaticMethod1 {
	int name;//instance variable
	String roll;//instance variable
	static String college = "Brilliant";//static variable

	StaticMethod1(int n,String r) {
		name = n;
		roll = r;
	}
	static void change() {//static method
	college = "Brilliant";
	}
	void display()  {
		System.out.println(name + " "+ roll + " " +college);
	}
	public static void main(String[] args) 
	{
		StaticMethod1 s1 = new StaticMethod1(16785,"Srikanth");
		StaticMethod1 s2 = new StaticMethod1(16786,"Avinash");
		StaticMethod1 s3 = new StaticMethod1(16787,"Rohit");
		s1.display();
		s2.display();
		s3.display();
	}
}
	


