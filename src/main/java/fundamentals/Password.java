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
        int random = r.nextInt(26); 

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        System.out.println("random number: " + random + " character " + alphabet.charAt(random)); 
        return "";
    }
}
