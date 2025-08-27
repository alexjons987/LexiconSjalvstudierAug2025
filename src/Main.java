//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Java - Getting Started
        System.out.println("Hello World!");

        // Java - Output
        // Text
        System.out.println("Hello World!");
        System.out.println("I am re-learning Java.");
        System.out.println("It is awesome!");

        System.out.print("Printing with no newline ");
        System.out.println("So this text is on the same line");

        // Numbers
        System.out.println(3);
        System.out.println(365);
        System.out.println(50000);
        System.out.println(3 + 3);
        System.out.println(2 * 5);
        System.out.println(1 + 2 * 3);

        // Java - Comments
        // This is a comment
        /*
            This is a
            multi-line
            comment
         */

        // Java - Variables
        // type variableName = value;

        // Variables
        String name = "Alexander";
        System.out.println(name);

        int myNum = 123;
        System.out.println(myNum);

        int myOtherNum;
        myOtherNum = 321;
        System.out.println(myOtherNum);

        int myOtherOtherNum = 1;
        myOtherOtherNum = 2;
        System.out.println(myOtherOtherNum);

        final int myConstNum = 11; // final = constant, can't change
        int integer = 5;
        float floatingNum = 1.255f;
        char character = 'A';
        boolean bool = true;
        String text = "Hello World!";

        // Print Variables

        getStarted();
    }

    public static void getStarted() {
        System.out.println("Hello World!");
    }
}