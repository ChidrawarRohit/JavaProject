package Maccess;
import Test.Addition;
public class DemoInterface1 {
  public static void main(String [] argd) {
	   //IArithmetic ob= New IArithmetic();
	  Addition ob= new Addition();//Implementation object
	  ob.calculate(12,13);
  }
}
