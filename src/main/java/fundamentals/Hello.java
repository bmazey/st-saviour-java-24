package fundamentals;

public class Hello {
    public static void main(String[] args) {
        // this space is provided for experimentation purposes
        System.out.println("new dawn, new day");

        boolean result = Palindrome.isPalindrome("hannah");
        System.out.println(result);

        Password.generatePassword();
    }
}