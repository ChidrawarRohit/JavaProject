
public class StaticVariable1 {
	int name;
	String roll;
	static String college = "Brilliant";

	StaticVariable1(int n,String r) {
		name = n;
		roll = r;
	}
	void display()  {
		System.out.println(name + " "+ roll + " " +college);
	}
	public static void main(String[] args) 
	{
		StaticVariable1 s1 = new StaticVariable1(501,"Srikanth");
		StaticVariable1 s2 = new StaticVariable1(505,"Avinash");
		s1.display();
		s2.display();
	}
}
	
