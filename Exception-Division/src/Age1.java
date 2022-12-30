
public class Age1 {

	public static void main(String[] args) {
		int Age = 18;
		try {
			validateage(Age);

			if (Age >=18) {
				System.out.println("major");
			} else {
				System.out.println("minor");
			}
		} catch (Exception e)  {
			System.err.println("No Access");	
		}
	}
	static void validateage(int age) throws Exception {
		if (age<0 || age>100) {
			throw new Exception();
		}
	}
}
