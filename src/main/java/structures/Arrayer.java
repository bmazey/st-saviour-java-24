package structures;

// documentation: https://www.baeldung.com/java-arrays-guide
public class Arrayer {
    /**
     * @param input
     * @return
     */
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
    /**
     * @param input
     * @return
     */
    public static int[] lastOfFourDigits(int[] input) {
        // TODO implement lastOfFourDigits()
         int[] result = new int[input.length];
        for(int i = 0; i < input.length; i++) {
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
    /**
     * @param input
     * @return
     */
    public static int[] roundUp(double[] input) {
    // TODO implement roundUp()
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
     * integers in the provided array are p ositive.
     * 
     * ex: [0, 4, -2, 17] -> 2 
     */
    public static int findNegative(int[] input) {
        for(int i = 0; i < input.length; i++) {
//for loop to establish the array and positions within in.
        if(input[i] < 0) {
    //any number less than 0 is considered negative 
        return i;
        }
        }
    return -1;
    }
    
}
