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
        // TODO implement evensOnly() 
        int count = 0;
        for(int i = 0; i < input.length; i++) {
            // check to see if number is even
            if(i % 2 == 0) {
                // number is even, increment count by 1
                count++;
            }
        }

        // create an array of the correct size
        int[] result = new int[count];
        // start at position 0 for result array
        int position = 0;
        // go over the input array again
        for(int i = 0; i < input.length; i++){
            // check if the number is even again
            if(input[i] % 2 == 0) {
                // add the even number to the result array
                result[position] = input[i];
                // increment postion for the result array
                position++;
            }
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
    public static int[] lastOfFourDigits(int[] input) {
        // TODO implement lastOfFourDigits()
        // input result is equal to the length of the input
        int[] result = new int[input.length];
        // create loop
        for(int i = 0; i < input.length; i++){
            //result at the current position = input at the current position
            result[i] = (input[i]) % 10;
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
        //create an array
        int[]result= new int[input.length];     
        for(int i = 0; i < input.length; i++){
            if(input[i]%1 >= 0.5){
                result[i] = (int)input[i] + 1;
            }

            else{
                result[i]=(int)input[i];
            }
            return result;
        }

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
         // TODO implement findNegative()
        for(int i = 0; i < input.length; i++) {
            if(input[i] < 0) {
             // the number is negative
                return i;
            }
            
        }
        // there were no negative integers in input[]
        return -1;
    }
}