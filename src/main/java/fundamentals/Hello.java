package fundamentals;

public class Hello {
    public static void main(String[] args) {
        // this space is provided for experimentation purposes
        // System.out.println("new dawn, new day");

        // read the documentation: https://www.baeldung.com/java-primitives

        // integer operations
        int a = 5;
        int b = 2;
        double c = 3;
        System.out.println(a / b * c);

        // casting 'down'
        double d = 3.5;
        System.out.println((int)d);

        // casting 'up'
        int e = 4;
        System.out.println((double)e);

        // char emojis
        String context = "lie for you, die for you, paint the sky for you ";
        context += new String(Character.toChars(0x1F304));
        System.out.println(context);

        // the plot of Office Space (1999)
        // https://en.wikipedia.org/wiki/Pentium_FDIV_bug
    }
}