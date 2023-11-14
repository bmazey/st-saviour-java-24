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
<<<<<<< HEAD
        if(i % 15 == 0){
            return "fizzbuzz";
        }
        else if (i % 5 ==0){
            return "buzz";
        }
        else if (i % 3 ==0) {
            return "fizz";
        }
        return "";
=======
        String result = "";

        // check multiple of 3
        if (i % 3 == 0) {
            result += "fizz";
        }

        // check multiple of 5
        if(i % 5 == 0) {
            result += "buzz";
        }

        return result;
>>>>>>> d45f76c0e167894edabe5dc290ecf0665ae10dd2
    }
}
