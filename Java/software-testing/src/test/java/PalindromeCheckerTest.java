import org.junit.Assert;
import org.junit.Test;

public class PalindromeCheckerTest {

    // This is a test method to validate the isPalindrome method
    @Test
    public void testIsPalindrome(){
        boolean actualResult = PalindromeChecker.isPalindrome("MADAM");
        //assert actualResult==true;
        Assert.assertTrue(actualResult);

        actualResult=PalindromeChecker.isPalindrome("CLEAR");
        //assert actualResult==false;
        Assert.assertFalse(actualResult);

        actualResult=PalindromeChecker.isPalindrome("AYOMIDE");
        //assert actualResult==false;
        Assert.assertFalse(actualResult);

        actualResult=PalindromeChecker.isPalindrome("RaCecAr");
        //assert actualResult==true;
        Assert.assertTrue(actualResult);
    }

}
