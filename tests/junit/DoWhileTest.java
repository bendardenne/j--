package junit;


import junit.framework.TestCase;
import pass.DoWhile;

public class DoWhileTest extends TestCase {

    private DoWhile or;
    
    public void setUp() throws Exception {
        super.setUp();
        or = new DoWhile();
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    public void test() {
        this.assertEquals(or.doWhile(3), 12);
        this.assertEquals(or.doWhile(0), 0);
        /*this.assertEquals(leftshift.leftShift(21, 1), 42);
        this.assertEquals(leftshift.leftShift(49, 4), 784);
        this.assertEquals(leftshift.leftShift(0, 0), 0);
        this.assertEquals(leftshift.leftShift(1, -1), -2147483648);
        this.assertEquals(leftshift.leftShift(-4, 3), -32);*/
    }

}
