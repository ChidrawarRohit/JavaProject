
public class StaticMethods 
{
	int a =10;
	static int b=20;
	void m1()
	{
		System.out.println("==Instance m1()==");
		System.out.println("The value of a="+a);
		System.out.println("The value of b="+b);
	}
	static void m2()//static method memory in class
	{
		System.out.println("==Static m2()==");
		System.out.println("The value of a=" +10);
		System.out.println("The value of b="+20);
	}
	public static void main(String[] args) 
	{
		StaticMethods ob = new StaticMethods();
		ob.m1();
		StaticMethods.m2();
	}

}
