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
        // this variable is how we keep track of the amount of evens 
        int count = 0;
        for (int i = 0; i < input.length; i++)
        // check to see if the number is even using mod
        if(input[i] % 2 == 0) {
            count++;
            // increment count by 1 
        }
        // create an array of the right size 
        int[] result = new int[count];
        int position = 0;
        for (int i = 0; i < input.length; i ++){
            if(input [i] % 2 ==0) {
                result[position] = input[i];
                position ++;
            }
        }
        return new int[0]; 
    }

    /*
     * lastOfFourDigits() takes an int array which ONLY contains four digit 
     * numbers [1000 - 9999]. The method returns a new array which contains the last three digits 
     * of each number, preserving the original order.
     * 
     * ex: [1004, 9181, 1700, 4565] -> [4, 1, 0, 5]
     */
    public static int[] lastOfFourDigits(int[] input) {
            int[] result = new int[input.length];
            // the result string will be the same length of the original string because we're simply editing the original string 
            for (int i = 0; i < input.length; i++) {
                // Use mod to get the last three digits
                result[i] = input[i] % 1000;
            }
        
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
        return new int[0];
    }

    /*
     * findNegative() returns the position of the first occurence of a negative 
     * integer in the input array. findNegative() should return -1 if all
     * integers in the provided array are positive.
     * 
     * ex: [0, 4, -2, 17] -> 2 
     */
    public static int findNegative(int[] input) {
       for(int i=0; i < input.length; i++){
        if(input[i] < 0) {
        // the number is negative
        return i;
       }
       }
        return -1;
        // there is no negative numbers so theres no real position to return 
    }
    
}

//public static int[] everyother(int[] input)
//create a methof "everyother" which accepts an array (list) of ints and returns a 
//new array containing only the og numbers with even positions 

// to create a new array: int[] myArray = new int[4];
// this is how you make a new array of 4 items 
// int[] myArray = new int[]{4, 4, 3, 1};
// this still has 4 items but this defines what the items are 

//System.out.println("array length: " + myArray.length).
// That is how to print the length of an array 
// print the item in first position : System.out.println("array length: " + myArray[0])
// defalut value of every item in list is 0 !!!
// System.out.println("array length: " + myArray[myArray.length - 1])
// this prints the last number of any length array 

//print every item in array: for(int i = 0; i < myArray.length; i++){
//
