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
        // TODO - implement generatePassword() ...
        Random r = new Random();
        //calls the random method
        String password = "";
        //creates an empty string variable called password
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        //a string variable called alphabet
        String digits = "0123456789";
        //a string variable called digits
        String symbols = "!@#$%^&*";
        //a string variable called symbols
        for(int i = 0; i<5; i++){
            //a for loop that runs 5 times
            int random = r.nextInt(26);
            password = password + alphabet.charAt(random);
            //adds a random character from the alphabet variable and adds it to password
        }
        for(int i = 0; i<4; i++){
            //runs a for loop 4 times
            int random = r.nextInt(10);
            password = password + digits.charAt(random);
            //adds a random character from digits and adds it to password
        }
        int random = r.nextInt(8);
        password = password + symbols.charAt(random);
        //adds a random character from symbols to password
        System.out.println("password: " + password);
        //prints out password: along with the password generated
        return password;
        //just outputs the password
    }
}
