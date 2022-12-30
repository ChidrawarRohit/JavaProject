
public class StudentMarks {

	private static final int Subject = 0;
	public static void main(String[] args) throws Exception {
		int marks = 35;
		try {
			validatemarks(Subject);

			if (Subject >=35) {
				System.out.println("pass");
			} else {
				System.out.println("fail");
			}
		} catch (Exception e)  {
			System.err.println("No Access");	
		}
	}
	private static void validatemarks(int subject2) {
		// TODO Auto-generated method stub

	}
	static void validateage(int age) throws Exception {
		if (Subject<0 || Subject>100) {
			throw new Exception();
		}
	}
}








