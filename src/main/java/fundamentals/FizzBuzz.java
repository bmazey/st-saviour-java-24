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
        //creates an empty string variable
        if(i%3 == 0){
            result += "fizz";
        }
        //an if statement that checks if the number can be divided evenly by 3
        //adds the word fizz to the result if it does
        if(i%5 == 0){
            result += "buzz";
        }
        //an if statement that checks if the number can be divided evenly by 5
        //adds the word buzz onto result if it does
        return result;
        //returns the variable result
    }
}
