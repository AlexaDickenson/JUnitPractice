import org.junit.Test;
import static org.junit.Assert.*;

    public class MonkeyTroubleTest {

        @Test
        public void testMonkeyTrouble() {
            MonkeyTrouble monkeyTrouble = new MonkeyTrouble();

            // Test case: Both monkeys are smiling
            assertTrue(monkeyTrouble.monkeyTrouble(true, true));

            // Test case: Both monkeys are not smiling
            assertTrue(monkeyTrouble.monkeyTrouble(false, false));

            // Test case: One monkey is smiling and the other is not
            assertFalse(monkeyTrouble.monkeyTrouble(true, false));

            // Test case: One monkey is smiling and the other is not (reverse order)
            assertFalse(monkeyTrouble.monkeyTrouble(false, true));
        }
    }

