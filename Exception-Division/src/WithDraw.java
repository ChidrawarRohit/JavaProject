
public class WithDraw {

	public static void main(String[] args) {
		int balance = 10000;
		int WithdrawAmount = 50000;
		try {
			int result = Withdraw(balance , WithdrawAmount);
			System.out.println("Balance after withdraw");
		} catch (Exception e)  {
			System.err.println("Withdraw is nqot possible");
		}finally {
			System.out.println(balance + " " + WithdrawAmount);
		}
	}
	static int Withdraw(int balance , int WithdrawAmount )throws Exception {
		//when value of b is zero, then there ia a problem
		if(WithdrawAmount >  balance)  {
			throw new Exception();
		}
		int result = balance - WithdrawAmount;
		return result = result;
	}
}


