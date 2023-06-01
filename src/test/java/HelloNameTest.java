import org.junit.Test;
import static org.junit.Assert.*;

public class HelloNameTest {

        @Test
        public void testHelloName() {
            HelloName helloName = new HelloName();

            // Test case: Name is "Alice"
            assertEquals("Hello Alice!", helloName.helloName("Alice"));

            // Test case: Name is "Bob"
            assertEquals("Hello Bob!", helloName.helloName("Bob"));

            // Test case: Name is an empty string
            assertEquals("Hello !", helloName.helloName(""));

            // Test case: Name is null
            assertEquals("Hello null!", helloName.helloName(null));
        }
    }

