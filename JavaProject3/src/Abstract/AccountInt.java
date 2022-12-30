package Abstract;

public abstract class AccountInt {
	 double result;

	public AccountInt() {
		

	}
	public AccountInt(double result ) {
		super();
		this.result = result;
	}
    abstract void interest();
	void show()  {
		System.out.println(result);
	}
	
	}


