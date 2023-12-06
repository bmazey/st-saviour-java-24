package structures;

// documentation: https://www.baeldung.com/java-arrays-guide
public class Arrayer {
    /*
     * evensOnly() takes an int array and returns a new array which contains
     * only even numbers found within the original array, preserving the original 
     * order.
     * 
     * ex: [3, 7, 12, 4, 13, 0] -> [12, 4, 0]
     */
    public static int[] evensOnly(int[] input) {
        // this variable keeps count of amount of even numbers
        int count = 0;
        // for loop that goes through each item in input
        for (int i = 0; i<input.length; i++) {
            // check to see if number is even
            if (input[i] % 2 == 0) {
               // number is even, add to count
                count++;
            }
        }
        // creates an array of the correct size
        int[] result = new int[count];
        // starts at the first item in position
        int position = 0;
        // creates a for loop that goes through each item in input again
        for (int i = 0; i< input.length; i++) {
            // checks to see if the item is diviible by 2
            if (input[i] %2 == 0) {
               // adds the number to the array "result"
                result[position] = input[i];
                position++;
            }
        }
        // returns the new array
        return result;
    }
    /*
     * lastOfFourDigits() takes an int array which ONLY contains four digit 
     * numbers [1000 - 9999]. The method returns a new array which contains the last three digits 
     * of each number, preserving the original order.
     * 
     * ex: [1004, 9181, 1700, 4565] -> [4, 1, 0, 5]
     */
    public static int[] lastOfFourDigits(int[] input) {
        // creates an array called result that is equal to the length of input
        int[] result = new int[input.length];
        // a for loop that goes through each position in input
        for (int i = 0; i<input.length; i++) {
            // finds the last number and adds it to result
            result[i] = input[i]%10;
        }
        // returns the array result
        return result;
    }
    /*
     * roundUp() takes an array of doubles as input, and returns a new array of rounded
     * integers. As a general rule, we only round up when the decimal is >= 5.
     * 
     * ex: [1.2, 3.6, 7.9, 4.1] -> [1, 4, 8, 4]
     */
    public static int[] roundUp(double[] input) {
        // creates a new array called result that has the same length as input
        int[] result = new int[input.length];
        // iterates through each item in input
        for (int i = 0; i<input.length; i++) {
           // checks to see if the value at input i has a decimal greater or equal to 0.5
            if (input[i]%1 >= 0.5) {
                // changes the type to an int and adds one
                result[i] = (int)input[i]+ 1;
            } else {
                // if less than 0.5 this changes the type to an int
                result[i] = (int)input[i];
            }
        }
        // returns the result array
        return result;
    }
    /*
     * findNegative() returns the position of the first occurence of a negative 
     * integer in the input array. findNegative() should return -1 if all
     * integers in the provided array are positive.
     * 
     * ex: [0, 4, -2, 17] -> 2 
     */
    public static int findNegative(int[] input) {
      // iterates through each item in input
        for (int i = 0; i< input.length; i++) {
          // tests the number to see if it is less than 0
            if (input[i]<0) {
            // the number is negative
              return i;
             }
        }
        // if the if statement is not passed return -1
        return -1;
    }
}
