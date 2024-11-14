import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Test {

    @Test
    public void testIsPrime() {
        // Test cases for isPrime method
        assertTrue(Main.isPrime(2), "2 should be prime");
        assertFalse(Main.isPrime(0), "0 should not be prime");
    }

    @Test
    public void testIsPalindrome() {
        // Test cases for isPalindrome method
        assertTrue(Main.isPalindrome("Test"), "\"Test\" is not a palindrome");
        assertTrue(Main.isPalindrome("ebube"), "\"ebube\" is a palindrome");

      
    }
}
