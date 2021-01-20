import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    Palindrome palindrome;

    @Before
    public void setUp() {
        palindrome = new Palindrome();
    }

    @Test
    public void isPalindromeFalse() {
        assertFalse(palindrome.isPalindrome("/,.?racecare"));
    }

    @Test
    public void isPalindromeTrue() {
        assertTrue(palindrome.isPalindrome("/.racecar"));
    }

    @Test
    public void isPalindromeOneSymbol(){
        assertTrue(palindrome.isPalindrome("a"));
    }
}