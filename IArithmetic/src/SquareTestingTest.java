import junit.framework.TestCase;

public class SquareTestingTest extends TestCase {

	public void testSquare() {
		SquareTesting test = new SquareTesting();
		int output = test.square(10);
		assertEquals(100,output);
	}

	public void testCube() {
		SquareTesting test = new SquareTesting();
		int output = test.cube(10);
		assertEquals(1000,output);
	}

}
