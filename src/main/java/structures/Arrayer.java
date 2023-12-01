package structures;

import javax.management.openmbean.ArrayType;

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
        // make a variable 
        int count = 0;
        // telling the system that you start at position 0 and continue to go through all positions
        for(int i = 0; i < input.length; i++) {
            //check to see if number is even 
            if(input[i] % 2 ==0) {
                //number is even, increment count by 1 
                count++;
            }
        } 
        // create an array of the correct size
        int[] result = new int [count];
        int position = 0;
        for(int i = 0; i < input.length; i++) {
            // mod number to see if it is even.
            if(input[i] % 2 == 0) {
                result[position] = input [i];
                position++;
            }
        }
        //now after the system picks out all the even numbers it creates a new array with those even numbers 
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
        // Create a new array 
        int[] result = new int[input.length];
        // create a for loop so that the system can mod each number
        for(int i = 0; i<input.length; i++) {
            //mod by 10 so that you can get the digit in the last position
            result[i] = input[i]%10;
          }
// now the system returns a new array with all the digits it received after doing mod
        return result;
    }
    /*
     * roundUp() takes an array of doubles as input, and returns a new array of rounded
     * integers. As a general rule, we only round up when the decimal is >= 5.
     * 
     * ex: [1.2, 3.6, 7.9, 4.1] -> [1, 4, 8, 4]
     */
    public static int[] roundUp(double[] input) {
        // TODO implement roundUp()
        // As always you create a new array 
        int[] result = new int[input.length]; 
        // Now you create a forloop so that the system runs through each position 
        for(int i = 0; i<input.length; i++) {
            //Mod each number by 1, if the result is greater than .5 then you round the number up 
            if(input[i] % 1 >= 0.5 ) {
                result[i] = (int)input[i] + 1;
            }
            // create an else statement incase the result of mod 1 is less than .5 it just gives you the integer 
            else{
                result[i] = (int)input[i];
            }
        }
        // Return the new array with the round up or same integer 
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
        // create a for loop so that the system goes through all position 
       for(int i = 0; i < input.length; i++) {
        // if the digit in the position is less than zero the system returns the digit
        if(input[i] < 0) {
            return i;
         }
         }
         // if the digit in the position is greater than zero the system returns a -1 becuase it is not negative 
         return -1;
    }   
}
