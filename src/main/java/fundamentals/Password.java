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
      
        String letters = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String symbols = "!@#$%^&*";
        
        StringBuilder password = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            int index = random.nextInt(letters.length());
            password.append(letters.charAt(index));
        }

        for (int i = 0; i < 4; i++) {
            int index = random.nextInt(digits.length());
            password.append(digits.charAt(index));
        }

        int symbolIndex = random.nextInt(symbols.length());
        password.append(symbols.charAt(symbolIndex));

        // Shuffle the characters to make it unlikely that two passwords are equal
        // String shuffledPassword = shuffleString(password.toString());

        return password.toString();
    }

    
    private static String shuffleString(String input) {
        char[] characters = input.toCharArray();
        for (int i = characters.length - 1; i > 0; i--) {
            int index = new Random().nextInt(i + 1);
            char temp = characters[i];
            characters[i] = characters[index];
            characters[index] = temp;
        }
        return new String(characters);
    }
}
