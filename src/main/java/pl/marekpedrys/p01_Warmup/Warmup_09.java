// Warmup_09.
// Read 5 numbers from the console entered by the user and print the maximum number the user has entered.

package pl.marekpedrys.p01_Warmup;

import java.util.Scanner;

public class Warmup_09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int max = Integer.MIN_VALUE;

        while (counter < 5) {
            System.out.println("Enter number #" + (counter + 1) + ": ");

            if (scanner.hasNextInt()) {
                int enteredNumber = scanner.nextInt();
                counter++;

                if (enteredNumber > max) {
                    max = enteredNumber;
                }
            } else {
                System.out.println("Invalid entry");
            }
            scanner.nextLine();
        }

        scanner.close();

        System.out.println("The largest entered number : " + max);
    }
}
