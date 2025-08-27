//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Java - Getting Started
        System.out.println("Java - Getting Started");
        System.out.println("Hello World!");

        // Java - Output
        System.out.println("Java - Output");
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
        System.out.println("Java - Variables");
        // type variableName = value;

        // Variables
        String myName = "Alexander";
        System.out.println(myName);

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
        String name = "Alex";
        System.out.println("Hello " + name);

        String firstName = "Alex ";
        String lastName = "Jons";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        int x = 2;
        int y = 3;
        System.out.println(x + y);

    }

    public static void getStarted() {
        System.out.println("Hello World!");
    }
}