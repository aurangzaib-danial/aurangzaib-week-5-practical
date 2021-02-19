/**
 * Task 6 While
 *
 * @author Aurangzaib Danial Liaqat Khan
 * @version 19/02/21
 */

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a whole number.");

        while (!scanner.hasNextInt()) {
           System.err.println("Error! You must enter a whole integer.");
           scanner.next();
        }

        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("You entered: " + number + "! This is a positive integer");
        } else if (number < 0) {
            System.out.println("You entered: " + number + "! This is a negative integer");
        } else if (number == 0) {
            System.out.println("You entered: 0 ! This is neither positive nor negative");
        }
    }
}