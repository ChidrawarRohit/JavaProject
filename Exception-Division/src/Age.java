
public class Age {

	public static void main(String[] args) {
		int validage = 19;
		int personage = 85;
		try {
			int result = Age(validage , personage);
			if(result>0 && result<18) {
				System.out.println("minor");
			}
			else
				System.out.println("major");
		}
		catch (Exception e)  {
			System.err.println(" minor");

			System.err.println(" Out of range");
		}
		finally {
			System.out.println(validage+ " " + personage);
		}
	}
	static int Age(int validage , int personage )throws Exception {
		int result;
		if(personage >0|| personage > 85) {
			throw new Exception();
		}
		else {
	
		if(validage >= personage) {
			return result = validage;
		}
		else {
			return result = personage;
		
		}
		}
	}
}
		

	



