package topics;

import java.util.Scanner;

/**
 * Variables
 */
public class B_Variables {
    public static void main(String args[]) {
        System.out.println("Hello Variables!");

        testVariablesModification();
        testOperatorPrecedence();
    }

    public static void testVariablesModification() {


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

    }

    public static void testOperatorPrecedence() {
        // dinamically typed variable,
        var dynTypedVar = 3;
        System.out.println("### dynTypedVar " + dynTypedVar);
        // dynTypedVar = "A string";

        if (dynTypedVar instanceof Number) {
            System.out.println("The dynTypedVar is a Number.");
        }
        // else if (variable instanceof Integer) {
        // System.out.println("The variable is an Integer.");
        // } else {
        // System.out.println("The variable is of a different type.");
        // }

        int result1 = 21 - 6 / 3; // 21 - 2 = 19

        int result2 = (21 - 6) / 3; // 15 / 3 = 5

        System.out.println("### result 1 -> 21 - 6 / 3 = 21 - 2 = 19 ---> " + result1);

        System.out.println("### result 2 using (), (21 - 6) / 3 = 15 / 3 = 5 ---> " + result2);

        int result3 = 21 / 3 * 1 + 6; // 13

        int result4 = 21 / (3 * (1 + 6)); // 1

        System.out.println(result3);

        System.out.println(result4);
    }
}
