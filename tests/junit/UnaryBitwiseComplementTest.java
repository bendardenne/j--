package junit;


import junit.framework.TestCase;
import pass.UnaryBitwiseComplement;

public class UnaryBitwiseComplementTest extends TestCase {

    private UnaryBitwiseComplement unaryBitwiseComplement;

    public void setUp() throws Exception {
        super.setUp();
        unaryBitwiseComplement = new UnaryBitwiseComplement();
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    public void test() {  			
        this.assertEquals(unaryBitwiseComplement.unaryBitwiseComplement(42), -43);
        this.assertEquals(unaryBitwiseComplement.unaryBitwiseComplement(0), -1);
        this.assertEquals(unaryBitwiseComplement.unaryBitwiseComplement(1), -2);
        this.assertEquals(unaryBitwiseComplement.unaryBitwiseComplement(-42), 41);
        //this.assertEquals(unaryBitwiseComplement.unaryBitwiseComplement(unaryBitwiseComplement.unaryBitwiseComplement(5)), 5);
    }

}
