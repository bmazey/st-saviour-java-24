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
        // this varible keeps track of the amount of even numbers. 
        int count = 0;
        // runs through each element of the array
        for(int i = 0; i < input.length; i++) {
            // if the number is even, incrememnt count by 1. 
            if(input[i] % 2 ==0) {
                count++;
            }
        }
        // create array of correct size
        int[] result = new int[count];
        // starts at the first item in position
        int position = 0;
        // for loop goes through each item and tests if it is even by seeing if it is divisible by 2
        for (int i = 0; i < input.length; i++) {
            if(input[i] % 2 == 0) {
                // if it is even it adds the number to the array
                result [position] = input[i];
                // increases the position to make room for the next number
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
        // creates a new array that is the same length as the old one
        int[] result = new int[input.length];
        // goes through each element in the array
        for (int i = 0; i < input.length; i++) { 
            // takes the remainder of each number after it is divided by 10 and adds it to the new
            // array in the same position it was in in the old array
            result[i] = input[i] % 10;
        }
        // returns the new array
        return result;
    }
    /*
     * roundUp() takes an array of doubles as input, and returns a new array of rounded
     * integers. As a general rule, we only round up when the decimal is >= 5.
     * 
     * ex: [1.2, 3.6, 7.9, 4.1] -> [1, 4, 8, 4]
     */
    public static int[] roundUp(double[] input) {
        // creates a new array that is the same length as the original array
        int[] result = new int[input.length];
        // goes through each element in the list
        for (int i = 0; i < input.length; i++) {
            // by doing mod 1 to the first element in the list, it sepparates the decimal from that number
            // then the if statement checks if the decimal is greater than 0.5
            if(input[i] % 1 >= 0.5) {
                // if the statement is true the number is converted to an integer which takes off the decimal 
                // and is increased by 1 because it is being rounded up
                result[i] = (int)input[i] + 1;
            } 
            // if the decimal point was less than 0.5, the number is still converted to an integer which
            // rounds it down and then it is added to the new array
            else {
                result[i] = (int)input[i];
            }
        }
        //returns the new array
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
        // the for loop goes through each value in the array and the if statement tests if that value
        // is less than 0 and therefore negative
        for (int i = 0; i < input.length; i++) {
            if(input[i] < 0) {
            // if the number is negative, the position of that number is returned
            return i;
            }
        }//if none of the numbers are negative, -1 is returned because there is no position with a negative number
        return -1;
    }
}