package _04_Intro_To_Do_While;

import java.util.Random;
import java.util.Scanner;

public class DoWhileDemo {

    /*
     * A do-while loop is similar to a while loop except it always runs at least
     * one time.
     * 
     * You can use a do-while loop to avoid code repetition in many situations
     * where a while loop's condition is dependent on initialization of a
     * variable declared right before the loop.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
         * It is also useful for avoiding code repetition whenever you must deal
         * with input error as shown below. The code will repeat until exactly
         * what was requested is entered.
         */

        int dollars;

        do {
            System.out.println("Gimme 5 dollars please!");
            dollars = scan.nextInt();
        } while (dollars != 5);

        System.out.println("Finally! Thank you!");

        /*
         * 1. The code below would benefit from a do-while loop since the again
         * String variable is dependent on user input. Convert it to a do-while
         * loop so it will compile and work as expected.
         */

        Random rand = new Random();

        String again;

        while (again.equals("y")) {
            int flip = rand.nextInt(2);
            String coin;

            if (flip == 1)
                coin = "HEADS";
            else
                coin = "TAILS";

            System.out.println("You flip a coin and it is... " + coin);

            System.out.print("Would you like to flip again (y/n)? ");
            again = scan.next();
        }

        scan.close();
    }

}
