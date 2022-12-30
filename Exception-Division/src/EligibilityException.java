
public class EligibilityException extends Exception {
	public EligibilityException(String str)  {
		super(str);
	}
	public static void main(String[] args) throws EligibilityException {
		System.out.println("Saiavinash");
		try {
			int age = 17;
			System.out.println("26");
			if(age<18)  {
				throw new EligibilityException("You are not eligible for voter'id");
			}
			else {
				System.out.println("You are eligible for voter'id");
			}
		}
		catch(EligibilityException ee) {
			ee.printStackTrace();
		}

	}
}


