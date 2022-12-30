package Abstract;

public class CurrentAcc extends AccountInt{

	double rateofinterest;
	double principle;
	int month;
	public CurrentAcc() {

	}
	public CurrentAcc(double rateofinterest, double principle, int month) {
		super();
		this.rateofinterest = rateofinterest;
		this.principle = principle;
		this.month = month;
	}
void interest()  {
	System.out.println();
	this.result=(this.rateofinterest * this.principle * this.month)/100;

}
}	


