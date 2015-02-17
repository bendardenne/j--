package junit;


import junit.framework.TestCase;
import pass.LeftShift;

public class LeftShiftTest extends TestCase {

    private LeftShift leftshift;
    
    public void setUp() throws Exception {
        super.setUp();
        leftshift = new LeftShift();
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    public void test() {
        this.assertEquals(leftshift.leftShift(1, 2), 16);
        /*this.assertEquals(leftshift.leftShift(21, 1), 42);
        this.assertEquals(leftshift.leftShift(49, 4), 784);
        this.assertEquals(leftshift.leftShift(0, 0), 0);
        this.assertEquals(leftshift.leftShift(1, -1), -2147483648);
        this.assertEquals(leftshift.leftShift(-4, 3), -32);*/
    }

}
