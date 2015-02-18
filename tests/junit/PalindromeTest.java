package junit;


import junit.framework.TestCase;
import pass.Palindrome;

public class PalindromeTest extends TestCase {

    private Palindrome palindrome;
    
    public void setUp() throws Exception {
        super.setUp();
        palindrome = new Palindrome();
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    public void test() {  			
    	this.assertEquals(palindrome.palindrome("kayak"), "kayak");
        this.assertEquals(palindrome.palindrome("eluparcettecrapule"), "eluparcettecrapule");
        this.assertEquals(palindrome.palindrome("nope"), "");
    }

}
