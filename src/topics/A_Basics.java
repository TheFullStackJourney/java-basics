package topics;

/**
 * Java Basics:
 * - Packages
 * - Classes
 * - Main method
 * - Reserved Words
 */
public class A_Basics {
    public static void main(String args[]) {
        System.out.println("Hello world Javier!");

        int hours;

        // 1. get the number of hours worked
        hours = 40;

        // 2. get the hourly pay rate
        double payRate = 25.5;

        // 3. Multiply hours and pay rate
        double grossPay = hours * payRate;

        // 4. Display results
        System.out.println("Gross pay: " + grossPay);
    }
}
