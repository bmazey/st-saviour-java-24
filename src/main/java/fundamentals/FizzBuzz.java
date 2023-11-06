package fundamentals;

public class FizzBuzz {
    /*
     * Our FizzBuzz class takes an int i and returns a String ...
     *     - if int i is a multiple of 3, return "fizz"
     *     - if int i is a multiple of 5, return "buzz"
     *     - if int i is a multiple of 3 and 5, return "fizzbuzz"
     *     - if int i is neither a multiple of 3 or 5, return ""
     */

    public static String fizzBuzz(int i) {
        String result="";
        // setting up the empty string that fizzbuzz can be added to
        if (i%3==0) {
            result += "fizz";
        }
        // adds fizz to the result string if the number is a multiple of 3
        if (i%5==0) {
            result += "buzz";
        }
        // adds buzz to string if number is multiple of 5
        return result;
        // returns final string


    }
}
