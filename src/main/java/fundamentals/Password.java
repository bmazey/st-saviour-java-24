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

        Random r = new Random();

        String password = "";

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String symbols = "!@#$%^&*";

        for (int i = 0; i<5; i++) {
            int random = r.nextInt(26);
            password = password + alphabet.charAt(random);
        }

        for (int i = 0; i<4; i++) {
            int random = r.nextInt(10);
            password = password + digits.charAt(random);
        }

        int random = r.nextInt(8);
        password = password + symbols.charAt(random);

        


        System.out.println(password);



        return password;
    }
}
