package structures;

// documentation: https://www.baeldung.com/java-arrays-guide
public class Arrayer {
  
    public static int[] evensOnly(int[] input) {
    // TODO implement evensOnly() 
        int count = 0; 
        for(int i = 0; i < input.length; i++){
            if(input [i] % 2 == 0 ){
                count++;
            }
        }
        int[] result = new int [count];
        int position = 0;
        for(int i=0; i < input.length; i++)
            if(input[i] % 2 == 0 ){
                result[position] = input[i];
                position++;

            }
        return result;
    }

    /*
     * lastOfFourDigits() takes an int array which ONLY contains four digit 
     * numbers [1000 - 9999]. The method returns a new array which contains the last three digits 
     * of each number, preserving the original order.
     * 
     * ex: [1004, 9181, 1700, 4565] -> [4, 1, 0, 5]
     */

    // establishing a for loop to evalute the input and determine the remainder which is the last digits
    public static int[] lastOfFourDigits(int[] input) {
        int[] result = new int[input.length];
            for(int i = 0; i < input.length; i++) {
                result[i] = input[i] % 10;
        }
        return result;
    }

    /*
     * roundUp() takes an array of doubles as input, and returns a new array of rounded
     * integers. As a general rule, we only round up when the decimal is >= 5.
     * 
     * ex: [1.2, 3.6, 7.9, 4.1] -> [1, 4, 8, 4]
     */
// setting up an if statment that declares if the value mod by 1 is greater tahn or equal to 0.5 the vaule should be rounded up
    public static int[] roundUp(double[] input) {
    int[] result = new int [input.length];
    for (int i = 0; i < input.length; i++) {
        result[i] = (int) input[i];
            if (input[i] % 1 >= 0.5) {
                result[i]++;
            }
        }
            return result;
    }

    /*
     * findNegative() returns the position of the first occurence of a negative 
     * integer in the input array. findNegative() should return -1 if all
     * integers in the provided array are positive.
     * 
     * ex: [0, 4, -2, 17] -> 2 
     */
    // for loop used to establish the array + positions and if statment that declares any number less than 0 is negative and should be returned 
    public static int findNegative(int[] input) {
        for(int i = 0; i < input.length; i++) {
            if(input[i] < 0) {
        return i;
        }
        }
    return -1;
    }
    
}
