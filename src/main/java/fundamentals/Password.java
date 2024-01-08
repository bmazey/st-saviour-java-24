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
<<<<<<< HEAD
        // TODO - implement generatePassword() ...
        String letters = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String symbols = "!@#$%^&*";

        StringBuilder password = new StringBuilder();
        Random random = new Random();
        for(int i = 0; i < 5; i++) {
            password.append(letters.charAt(random.nextInt(letters.length())));
        }

        for (int i = 0; i < 4 ; i++) {
            //int index = ;
            password.append(digits.charAt(random.nextInt(digits.length())));
        }

        int symbolIndex = random.nextInt(symbols.length());
        password.append(symbols.charAt(symbolIndex));

        return password.toString();
  
=======
        String password = "";

        // create random number generator
        Random random = new Random();

        // create three Strings to represent character sets
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String symbols = "!@#$%^&*";

        // add five random letters
        for(int i = 0; i < 5; i++) {
            password += alphabet.charAt(random.nextInt(alphabet.length()));
        }

        // add four random digits
        for(int i = 0; i < 4; i++) {
            password += digits.charAt(random.nextInt(digits.length()));
        }

        // add a random symbol
        password += symbols.charAt(random.nextInt(symbols.length()));

        return password;
>>>>>>> 94827c21a4dc9fd842f94efbed1836e7d2857e24
    }
   
}
