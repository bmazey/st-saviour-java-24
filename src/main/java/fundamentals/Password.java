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
        Random r =  new Random();

        String password = "";

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String symbols ="!@#$%^&*";

        // To start off your password the program has to generate five random letters from a range of a-z.
        for(int i = 0; i < 5; i++) {
            int random = r.nextInt(26);
            password = password + alphabet.charAt(random);
        }
        // After letters are generated, the system now picks 4 random numbers from range 0-9.
        for(int i = 0; i < 4; i++) {
            int random = r.nextInt(10);
            password = password + digits.charAt(random);
        }
        // To end of your amazing password you need a symbol. The system is going to choose 1 symbol. There are 8 different symbols the system can choose. 
        int random = r.nextInt(8);
        password = password + symbols.charAt(random);
        System.out.println("password: " + password);

        return password;
    }
}

