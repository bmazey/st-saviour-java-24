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

        int count = 0;  
        for (int i = 0; i < input.length; i++) {
        // keeps track of amount of even numbers
            if (input [i] % 2 == 0) {

                count++;
            // if i is a multiple of 2 (even) its position will be counted
            }
        }

        int [] result = new int [count];
        // creates a new array for even numbers
        int position = 0;
        for (int i = 0; i < input.length; i++) {
            if (input [i] % 2 == 0) {
                // checks if current number is even
                result [position] = input[i];
                // add even number to result array
                position ++;
                // incremement position for the result array
            }
        }
        return result;
        // array of even numbers returned
    }

    /*
     * lastOfFourDigits() takes an int array which ONLY contains four digit 
     * numbers [1000 - 9999]. The method returns a new array which contains the last three digits 
     * of each number, preserving the original order.
     * 
     * ex: [1004, 9181, 1700, 4565] -> [4, 1, 0, 5]
     */
    public static int[] lastOfFourDigits(int[] input) {

        int [] result = new int [input.length]; 
        // new array created to be the length of the original array
        for (int i = 0; i < input.length; i++) {    
        // loop created to keep track of positions
            result [i] = input [i] % 10;
            // for i % 10, the remainder will be stored which happens to be the final digit
        }
        return result;
        // returns final digit of array's numbers
    }

    /*
     * roundUp() takes an array of doubles as input, and returns a new array of rounded
     * integers. As a general rule, we only round up when the decimal is >= 5.
     * 
     * ex: [1.2, 3.6, 7.9, 4.1] -> [1, 4, 8, 4]
     */
    public static int[] roundUp(double[] input) {
        
        int [] result = new int [input.length];
        // creates new array, becomes int to remove decimals

        for (int i = 0; i < input.length; i++){
            // keeps track of positions
            if (input [i] % 1 >= 0.5) { 
                result [i] = (int) input [i] + 1;
                // if i >= .5 it will round up 
            }
            else {
                result [i] = (int) input [i];
                // if i < .5 it will round down
            }
        }
        return result;
        // returns rounded numbers
    }

    /*
     * findNegative() returns the position of the first occurence of a negative 
     * integer in the input array. findNegative() should return -1 if all
     * integers in the provided array are positive.
     * 
     * ex: [0, 4, -2, 17] -> 2 
     */
    public static int findNegative(int[] input) { 

       for (int i = 0; i < input.length; i++){
        // loop created to keep track of positions
            if (input [i] < 0) {
                return i;
            // if the number is negative, it will return the number's position
        }
       }
        return -1;
        // if all numbers are positive it will return -1 since there are no positions with a negative number
        }

     // accepts an array of ints and returns a new array containing only numbers in even positions   
    public static int[] everyOther(int[] input){
        
        int evens = 0;
        for (int i = 0; i < input.length; i++){
        // for loop to keep track of array length
            if (input [i] % 2 == 0) {
            // even numbers should be added into array and returned                
                evens ++;
            // evens counts position of even numbers
            }
        }

        int[] result = new int[evens];
        // new array for even numbers

        return result;
        // returns even number array
    }
}
    

