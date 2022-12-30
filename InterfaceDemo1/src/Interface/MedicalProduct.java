package Interface;

public class MedicalProduct implements Expiry {

	
	int month;
	int year;

	public MedicalProduct() {
	}

	public MedicalProduct( int month, int year) {
		super();
		
		this.month = EXPIRYMONTH;
		this.year = EXPIRYYEAR;
	}
	public void getExpiryMonth() {
		System.out.println(this.month);	
	}
	public void getExpiryYear()  {
		System.out.println(this.year);
	}
}
