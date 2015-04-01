package junit;


import junit.framework.TestCase;
import pass.ConditionalOr;

public class ConditionalOrTest extends TestCase {

    private ConditionalOr or;
    
    public void setUp() throws Exception {
        super.setUp();
        or = new ConditionalOr();
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    public void test() {
        this.assertEquals(or.conditionalOr(true, true, false), true);
        this.assertEquals(or.conditionalOr(false, false, false), true);
        this.assertEquals(or.conditionalOr(false, false, true), true);
        /*this.assertEquals(leftshift.leftShift(21, 1), 42);
        this.assertEquals(leftshift.leftShift(49, 4), 784);
        this.assertEquals(leftshift.leftShift(0, 0), 0);
        this.assertEquals(leftshift.leftShift(1, -1), -2147483648);
        this.assertEquals(leftshift.leftShift(-4, 3), -32);*/
    }

}
