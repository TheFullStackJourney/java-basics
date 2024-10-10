package topics;

import java.util.Scanner;

/**
 * Decision Structures
 */
public class C_DecisionStructures {
    public static void main(String args[]) {

        // SOME THEORY


        // Examples

        //Initialize known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //Get values for the unknown
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        // IF condition
        // single inside statement
        if (sales > quota) salary = salary + bonus;

        // IF statement
        // multiple inside statement
        if (sales > quota) {
            salary = salary + bonus;
            System.out.println("hello");
        }

        // IF-ELSE statement
        // multiple inside statement
        if (sales > quota) {
            salary = salary + bonus;
            System.out.println("hello");
        } else {
            System.out.println("hello");
        }


        // IF-ELSE statement
        // multiple inside statement
        if (sales > quota) {
            salary = salary + bonus;
            System.out.println("hello");
        } else {
            System.out.println("hello");
        }


        //Output
        System.out.println("The employee's pay is $" + salary);

    }


}
