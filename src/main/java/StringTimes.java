public class StringTimes {
    public String stringTimes(String str, int n) {
        // Create an empty string variable to store the result
        String result = "";

        // Concatenate the original string to the result 'n' times
        for (int i = 0; i < n; i++) {
            result += str;
        }

        // Return the resulting string
        return result;
    }
}
