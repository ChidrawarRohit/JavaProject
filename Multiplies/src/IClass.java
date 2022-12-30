public class IClass {
	public static void main(String[] args) {
		int sumof3 = 0;
		int sumof5 = 0;
		int repeat = 0;
		
		for(int i = 1; i<1000; i++) {
			if(i%3==0)
				sumof3 +=i; 
		}
		for(int i = 1; i<1000; i++) {
			if(i%5==0)
				sumof5 +=i;
		}
		for(int i = 1; i<1000; i++) {
			if(i%3==0 && i%5==0)
				repeat +=i;

			System.out.println((sumof3 + sumof5)- repeat);
		}
	}
}

