package CClass;

public class BankTransaction {
	private final long HallTicketNo,BankAccountNo;
	private final float amt;
	private long HaccNo;
	private long BankNo;

	public BankTransaction(long HallTicketNo, long BankAccountNo, float amt) {
		super();
		this.HaccNo = HaccNo;
		this.BankNo = BankNo;
		this.HallTicketNo = 0;
		this.BankAccountNo = 0;
		this.amt = amt;

	}

	
	void show() {
		System.out.println(this.HallTicketNo + " " + this.BankAccountNo);
	}

	public long getHallTicketNo() {
		return HallTicketNo;
	}

	public long getBankAccountNo() {
		return BankAccountNo;
	}

	public float getAmt() {
		return amt;
	}
}