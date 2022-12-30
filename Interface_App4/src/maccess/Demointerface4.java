package maccess;
import java.util.*;

import test.Greater;
import test.Smaller;
public interface Demointerface4 {
public static void main(String [] args){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the value of x:");
	int x = s.nextInt();
	System.out.println("Enter the value of y:");
	int y=s.nextInt();
	System.out.println("Enter the value of z:");
	int z=s.nextInt();
	System.out.println("==Choice==");
	System.out.println("1.Greater\n2.Smaller");
	System.out.println("Enter the choice:");
	int choice=s.nextInt();
	switch(choice) {
	case 1:
		Greater gt=new Greater();
		int r1=gt.compareTo(x, y, z);
		System.out.println("GreaterValue:"+r1);
		break;
	case 2:
		Smaller sm= new Smaller();
		int r2=sm.compareTo(x, y, z);
		System.out.println("SmallerValue:"+r2);
		break;
		default:
			System.out.println("Invalid Choice..");
	}//end of switch
	s.close();
}
}
