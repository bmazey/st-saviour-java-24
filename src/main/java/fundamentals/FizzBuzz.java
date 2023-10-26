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
        // TODO - implement fizzBuzz() method
        String result = "";
// use mod command to see if there is a remainder 
        if (i % 3 == 0) {
            result += "fizz";
        }

        if (i % 5 == 0) {
            result += "buzz";
        }
        return result;
    }
}
