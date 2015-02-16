package junit;


import junit.framework.TestCase;
import pass.Division;


public class DivisionTest extends TestCase {

	private Division division;
	
	public void setUp() throws Exception {
		super.setUp();
		division = new Division();
	}

	public void tearDown() throws Exception {
		super.tearDown();
	}

	public void test() {
		this.assertEquals(division.divide(0, 42), 0);
		this.assertEquals(division.divide(42, 1), 42);
		this.assertEquals(division.divide(127, 3), 42);
	}

}
