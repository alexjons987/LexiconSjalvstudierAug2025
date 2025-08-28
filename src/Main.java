//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //
        // Java - Getting Started
        //
        System.out.println("\nJava - Getting Started");
        System.out.println("Hello World!");

        //
        // Java - Output
        //
        System.out.println("\nJava - Output");
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

        //
        // Java - Comments
        //
        System.out.println("\nJava - Comments");
        // This is a comment
        /*
            This is a
            multi-line
            comment
         */

        //
        // Java - Variables
        //
        System.out.println("\nJava - Variables");
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

        final int myConstNum = 11; // final = constant, can't change - not declared according to convention
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

        int myX = 2;
        int myY = 3;
        System.out.println(myX + myY);

        // Multiple Variables
        int a = 10;
        int b = 20;
        int c = 100;
        System.out.println(a + b + c);

        int x = 20, y = 40, z = 200;
        System.out.println(x + y + z);

        int w1, w2, w3;
        w1 = w2 = w3 = 500;
        System.out.println(w1 + w2 + w3);

        // Identifiers
        int hoursPerDay = 24; // GOOD identifier
        int hpd = 24; // BAD identifier

        // Constants (Final)
        final int HOURS_PER_DAY = 24;
        final int CURRENTYEAR = 2025;

        // Real-Life Examples
        String studentName = "Alex Jons";
        int studentID = 1234;
        int studentAge = 25;
        float studentFee = 500.55f;
        char studentGrade = 'S';
        System.out.println("Student name: " + studentName);
        System.out.println("Student ID: " + studentID);
        System.out.println("Student age: " + studentAge);
        System.out.println("Student fee: " + studentFee);
        System.out.println("Student grade: " + studentGrade);

        int length = 10;
        int width = 10;
        int area;
        area = length * width;
        System.out.println("Square length of " + length + " and a width of " + width + " gives an area of " + area);

        //
        // Java - Data Types
        //
        System.out.println("\nJava - Data Types");
        // Data Types & Numbers
        char oneCharacter = 'A';
        boolean flag = false;
        String helloWorldText = "Hello World";
        byte superSmallNumber = 127;            // -128 to 127
        short smallNumber = 32000;              // -32,768 to 32,767
        int wholeNumber = 9;                    // -2,147,483,648 to 2,147,483,647
        long superLongNumber = 999999999L;      // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float floatingNumber = 9.99f;           //  6 to  7 decimal digits
        double floatButLong = 9.9999999999d;    // 15 to 16 decimal digits

        // Booleans
        boolean thisIsTrue = true;
        boolean thisIsFalse = false;
        System.out.println(thisIsTrue);
        System.out.println(thisIsFalse);

        // Characters
        char myFirstCharacterInName = 'A';
        System.out.println(myFirstCharacterInName);

        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

        String anotherHello = "Hello World, for the 5th time!";
        System.out.println(anotherHello);
        System.out.println(anotherHello.charAt(21));

        // Real-Life Example
        int drinks = 24;
        float costPerDrink = 13.708f;
        float totalCost = drinks * costPerDrink;
        String currency = "kr (SEK)";
        System.out.println("Number of drinks: " + drinks);
        System.out.println("Cost per drink: " + costPerDrink + currency);
        System.out.println("Total cost = " + totalCost + currency);

        // Non-primitive Types
        int iAmPrimitive = 123;
        String iAmNotPrimitive = "I am a Class";

        //
        // Java -  Type Casting
        //
        System.out.println("\nJava - Type Casting");
        /*
            Automatic casting
            byte -> short -> char -> int -> long -> float -> double

            Manual casting (reversed)
            double -> float -> long -> int -> char -> short -> byte
         */
        int numberNine = 9;
        double doubledNine = numberNine;
        System.out.println("Integer (int = 9): " + numberNine);
        System.out.println("Double (double = int): " + doubledNine);

        double toBeCasted = 9.975d;
        int integerFromDoubleThroughCast = (int) toBeCasted;
        System.out.println(toBeCasted);
        System.out.println(integerFromDoubleThroughCast);

        int maximumPoints = 500;
        int userPoints = 166;
        float percentage = (float) userPoints / maximumPoints * 100.0f;
        System.out.println(percentage);

        //
        // Java -  Operators
        //
        System.out.println("\nJava - Type Casting");
        int xx = 25, yy = 50, zz = 100;
        System.out.println(xx + yy + zz); // 175
        System.out.println(xx++); // Increment pre-usage, prints 25
        System.out.println(++xx); // Increment post-usage, prints 27
        xx = 25;
        System.out.println((float) (xx * yy - zz) / 100.0f);
        System.out.println(zz % 15);
        System.out.println(xx + 25 == yy);
        System.out.println(xx + 25 != yy);
        System.out.println(yy > xx);
        System.out.println(yy > zz);
        System.out.println(true || false);
        System.out.println(true && false);

        //
        // Java - Strings
        //
        System.out.println("\nJava - String");
        // Strings
        String engAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The english alphabet: " + engAlphabet);
        System.out.println("English alphabet length: " + engAlphabet.length());
        System.out.println("Lower case alphabet: " + engAlphabet.toLowerCase());
        System.out.println("First letter of my name at index: " + engAlphabet.indexOf('A'));
        System.out.println("Letter at index 23: " + engAlphabet.charAt(23));

        // Concatenation
        System.out.println(firstName + lastName);
        System.out.println(firstName.concat(lastName));

        // Numbers and Strings
        int aNum = 10;
        System.out.println(lastName+10);

        // Special Characters
        System.out.println("Dubbelfnutt i en sträng \"\"\"\"\"\n(annars kallat escape characters)");

        //
        // Java - Math
        //
        System.out.println("\nJava - Math");
        System.out.println("Max of 10 and 20: " + Math.max(10, 20));
        System.out.println("Min of 10 and 20: " + Math.min(10, 20));
        System.out.println("Square root of 128: " + Math.sqrt(128));
        System.out.println("Absolute of -1.5: " + Math.abs(-1.5));
        System.out.println("Random number!: " + Math.random());

        //
        // Java - Booleans
        //
        System.out.println("\nJava - Booleans");
        System.out.println("I understand booleans: " + (1 == 1));

        int votingAge = 16;
        if (studentAge > votingAge)
            System.out.println("Student eligible for voting!");
        else
            System.out.println("Student ineligible for voting!");

        //
        // Java - If...Else
        //
        System.out.println("\nJava - If...Else");
        if(true)
            System.out.println("I'm always true!");

        if(x > y)
            System.out.println("x is greather than y");
        else if (x == y)
            System.out.println("x is equal to y");
        else
            System.out.println("y is greater than x");

        String xGreaterThanYString = x > y? "x is greater than y" : "x is not greater than y";
        System.out.println(xGreaterThanYString);

        //
        // Java - Switch
        //
        System.out.println("\nJava - Switch");
        int dayOfTest = 2;
        switch (dayOfTest) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("No day beyond 7 or before 1!");
                break;
        }

        //
        // Java - While Loop
        //
        System.out.println("\nJava - While Loop");

        byte thisIsAChar = 65;
        while ((char) thisIsAChar != 'D') { // ABC
            System.out.print((char) thisIsAChar);
            thisIsAChar++;
        }
        System.out.println(); // new line

        int dice = 1;
        do {
            dice = (int) (Math.random() * 6 + 1);
            System.out.println("You rolled " + dice);
        } while (dice < 6);
        System.out.println("Yatzy!");

        //
        // Java - For Loop
        //
        System.out.println("\nJava - For Loop");
        for (int i = 1; i <= 10; i++)
            System.out.print(i + " ");
        System.out.println(); // New line

        int[][] arr = {{10, 20}, {30, 40}};
        int total = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                total += arr[i][j];
        System.out.println(total);
    }

    public static void getStarted() {
        System.out.println("Hello World!");
    }
}