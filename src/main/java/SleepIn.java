public class SleepIn {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        // If it's not a weekday (!weekday) or you are on vacation (vacation),
        // return true indicating that you can sleep in
        if (!weekday || vacation) {
            return true;
        }

        // If it's a weekday and you are not on vacation, return false
        // indicating that you cannot sleep in
        return false;
    }
}
