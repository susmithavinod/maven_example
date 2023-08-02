import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Tester {
    @Test
    public void whenEmptyString_thenAccept(){
        snapper palindromeTester = new snapper();
        assertTrue(palindromeTester.isPalindrome(""));
    }
}
