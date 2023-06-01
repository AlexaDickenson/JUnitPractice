public class MonkeyTrouble {
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        // If both monkeys are smiling (aSmile and bSmile are both true) or
        // if both monkeys are not smiling (aSmile and bSmile are both false),
        // we are in trouble. Return true in such cases.
        if ((aSmile && bSmile) || (!aSmile && !bSmile)) {
            return true;
        }

        // If one monkey is smiling and the other is not, we are not in trouble.
        // Return false in this case.
        return false;
    }
}
