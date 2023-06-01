import org.junit.Test;
import static org.junit.Assert.*;

    public class SleepInTest {

        @Test
        public void testSleepIn() {
            SleepIn sleepIn = new SleepIn();

            // Test case: It's a weekday and not on vacation
            assertFalse(sleepIn.sleepIn(true, false));

            // Test case: It's a weekday and on vacation
            assertTrue(sleepIn.sleepIn(true, true));

            // Test case: It's not a weekday and not on vacation
            assertTrue(sleepIn.sleepIn(false, false));

            // Test case: It's not a weekday and on vacation
            assertTrue(sleepIn.sleepIn(false, true));
        }
    }


