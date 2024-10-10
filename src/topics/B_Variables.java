package topics;

import java.util.Scanner;

/**
 * Variables
 */
public class B_Variables {
    public static void main(String args[]) {
        System.out.println("Hello world Javier!");

        // SOME THEORY
        //  A variable is a memory location used to store data

        //  What is the difference between statically typed and dynamically typed programming languages?
        //  Dynamically typed languages determine the data type of variables at runtime. Statically typed languages
        //  determine the data type of variables at compile time.

        // Providing a default value for a variable at the time of declaration is known as initialization

        // In addition to adding two numbers together, what other purpose does the plus symbol serve in Java?
        // appending a value to a String

        // How does Java know the actual data type of a variable declared with var?
        // It infers the data type by the value that is assigned to the variable

        // Primitive data types, 8 types
        byte aByte = 100; // 8-bit , Integral, default: 0, max: 256
        short aShort = 10000; // 16-bit , Integral, default: 0, max:
        int anInt = 100000; // 32-bit , Integral, default: 0, max:
        long aLong = 99999999; // 64-bit , Integral, default: 0L, max: 9.2 quintillion

        int aFloat = 100000; // 32-bit , Floating point, default: 0.0f, max decimals: 7, max:
        long aDouble= 99999999; // 64-bit , Floating point, default: 0.0d, max decimals: 16 , max:

        boolean aBoolean = true; // true or false OR 1 or 0, default: FALSE
        char aChar= 'C'; // in single quotation marks, double are for strings, default: '\u0000'
        char aChar2= '\u0000';

        // LOCAL VARIABLE TYPE INFERENCE
        var name = "Javier"; // self type defined variable only inside methods, not globally available

        // Naming variables
        // SOFT RULES
        // - use types
        // - give vars descriptive names
        // - use camel case for multi word names
        // HARD RULES
        // - no spaces in the name
        // - can use numbers but not in the first character
        // - can use SOME special chars, like you can underscore my_var, but not dash my-var
        // - cannot be reserved words


        // MODIFYING VARS

        // capture input
        System.out.println("How many hours did you work?");
        // command line prompting using Scanner
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        System.out.println("Whats your pay rate?");
        // command line prompting using Scanner
        double payRate = scanner.nextDouble();

        scanner.close();

        double grossPayFromInput = hours * payRate;

        // 4. Display results
        System.out.println("Gross pay from input: " + grossPayFromInput);


        // ARITHMETIC OPERATORS
        // perform basic math calcs on numeric values (byte, short, int , long, float and double)
        double sum = 100 + 100; // adds 2 numeric values
        String sumStr = "100" + "100"; // concats 2 string values
        double substract = 100 - 80; // substracts 2 numeric values
        double multiply = 100 * 100; // multiplies 2 numeric values
        int divide = 100 / 20; // divides one numeric value by another
        int modulo = 5 % 2; // equal to 1, as it returns the remainder of dividing one numeric value by another

    }


}
