package fundamentals;

public class Hello {
    public static void main(String[] args) {
        // this space is provided for experimentation purposes
        // System.out.println("new dawn, new day");

        // discussion on errors
        // Java is strongly typed - what does that mean?
        // documentation: https://www.baeldung.com/java-primitives

        // integer operations
        int a = 5;
        int b = 2;
        System.out.println(a / b);

        double c = 3;
        System.out.println(a / b * c);
  

        // char emojis
        String context = "lie for you, die for you, paint the sky for you ";
        context += new String(Character.toChars(0x1F304));
        System.out.println(context);

        // the plot of Office Space (1999)
        // https://en.wikipedia.org/wiki/Pentium_FDIV_bug

        // testing equality
        // String pandas = "pandas";
        // String saviour = "pandas";

        // interned by the compiler
        // if (saviour == pandas) {
        //     System.out.println("saviour is equal (==) to pandas");
        // }
        // else {
        //     System.out.println("saviour is NOT equal (==) to pandas");
        // }

        // object comparison
        // if (new String("pandas") == "pandas") {
        //     System.out.println("new string pandas is equal to pandas");
        // }
        // else {
        //     System.out.println("new string pandas is NOT equal to pandas");
        // }

        // value comparison
        // if (new String("pandas").equals("pandas")) {
        //     System.out.println("new string pandas .equals() pandas");
        // }
        // else {
        //     System.out.println("new string pandas does NOT .equals() pandas");
        // }

        // string concatenation
        // if ("pandas" == "pan" + "das") {
        //     System.out.println("pandas is equal to concat string pan + das");
        // }

    //int[] myArray = new int[4];
    int[] myArray = new int[]{4,4,3,1};
    System.out.println("array length: "+ myArray.length);
    System.out.println("first item: " + myArray[0]);
    for (int i = 0; i< myArray.length; i++) {
        
    }
    }

    

}