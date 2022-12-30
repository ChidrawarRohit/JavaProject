package Maccess;
import java.util.Scanner;
import static java.lang.Math.*;
public class DemoStaticImport {
	  public static void main(String [] args) {
		  Scanner s =new Scanner(System.in);
		  System.out.println("Enter the value:");
		  double val = s.nextDouble();
		  double result = sqrt(val);
		  System.out.println("Sqrt of"+val+"is"+result);
		  s.close();
	  }
}

