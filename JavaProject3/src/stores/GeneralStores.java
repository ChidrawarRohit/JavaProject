package stores;

public class GeneralStores {

	public static void main(String[] args) {
		StationeryProduct s1 = new StationeryProduct("PencilBox", 35) ;
		
		s1.show();

		MedicalProduct m1 = new MedicalProduct("Dolo", 30 , 2023,12);
		m1.show();

	}

}
