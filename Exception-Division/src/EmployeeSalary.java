
public class EmployeeSalary {

	public static void main(String[] args) {
		int rohit = 50000;
		int rakesh = 100000 ;
		try {
			int result = EmployeeSalary(rohit, rakesh);
			System.out.println("Eligible for loan");
		} catch (Exception e)  {
			System.err.println("Not Eligible for loan");
		}finally {
			System.out.println(rohit + " " + rakesh);
		}
	}

	static int EmployeeSalary(int rohit, int rakesh )throws Exception {
		if(rakesh < rohit)  {
			throw new Exception();
		}
		int result = rohit- rakesh;
		return result = result;
	}

}
