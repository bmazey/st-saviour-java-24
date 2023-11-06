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
  
    }
   
}
