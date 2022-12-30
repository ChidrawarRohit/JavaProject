
public class Division {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		try {
			int result = Div(a , b);
			System.out.println(result);
		} catch (Exception e)  {
			System.err.println("Division is not possible");
		}finally {
			System.out.println(a + " " + b);
		}
	}
	static int Div(int a , int b )throws Exception {
		//when value of b is zero, then there ia a problem
		if(b == 0)  {
			throw new Exception();
		}
		int result = a/b;
			return result = result;
	}
}

