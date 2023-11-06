package fundamentals;

import java.util.Random;

public class Password {
    /*
     * Our Password class contains a static method generatePassword() which returns a String.
     * The returned String meets the following password complexity requirements:
     *     - the generated password must contain ten total characters
     *     - the first five characters must be lowercase letters
     *     - the next four characters must be digits between [0-9]
     *     - the final character must be a symbol [!@#$%^&*]
     *     - it should be highly unlikely that any two given generated passwords are equal 
     */

    public static String generatePassword() {
        // sets up the method generatePassword

        Random r = new Random();
        //sets up the random method

        String password = "";
        // delcares the string password as empty
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String symbols = "!@#$%^&*";
        // creates the list of possible letters, numbers, and symbols that could be used in the password

        for (int i = 0; i<5; i++) {
            int random = r.nextInt(26);
            password = password + alphabet.charAt(random);
        }
        // pulls 5 random characters from the 26 in alphabet and adds them to the password
        for (int i = 0; i<4; i++) {
            int random = r.nextInt(10);
            password = password + digits.charAt(random);
        }
        // pulls 4 random numbers from the 10 in digits and adds them to the password
        int random = r.nextInt(8);
        password = password + symbols.charAt(random);
        // pulls a random symbol from the 8 in symbols and adds it to the password
        System.out.println(password);

        return password;
        // prints and returns the password
    }
}
