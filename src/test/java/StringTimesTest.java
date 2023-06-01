import org.junit.Test;
import static org.junit.Assert.*;

public class StringTimesTest {

    @Test
    public void testStringTimes() {
        StringTimes stringTimes = new StringTimes();

        // Test case: str = "Hi", n = 3
        assertEquals("HiHiHi", stringTimes.stringTimes("Hi", 3));

        // Test case: str = "Hello", n = 5
        assertEquals("HelloHelloHelloHelloHello", stringTimes.stringTimes("Hello", 5));

        // Test case: str = "Bye", n = 1
        assertEquals("Bye", stringTimes.stringTimes("Bye", 1));

        // Test case: str = "", n = 10
        assertEquals("", stringTimes.stringTimes("", 10));
    }
}
