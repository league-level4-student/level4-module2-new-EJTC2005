package _05_Intro_To_Ternary_Operator;

public class TernaryOperatorDemo {

    /*
     * A ternary operator is a "syntactic sugar" alternative to if/else
     * statements that allows you to write an if/else statement on a single line
     * and set a value.
     */

    public static void main(String[] args) {

        int x = 5;

        /*
         * The following ternary operator checks if x is equal to 5(the if
         * condition).
         * 
         * If the condition is true it will return the first value after the ?
         * of x * 5 otherwise it will return the second value after the : of x /
         * 5.
         * 
         * 1. Try running the program once then change the value of x and run it
         * again
         */

        x = x == 5 ? x * 5 : x / 5;

        System.out.println(x);

        /*
         * 2. Ask the user what season it is and saves their input through use
         * of a Scanner.
         * 
         * 3. Use a ternary operator to evaluate the user response. If they say
         * "duck season" then set their input to instead be "FIRE!". Otherwise
         * set it to "rabbit season".
         * 
         * 4. Surround the previous parts with a do while loop and continue
         * until the response says "FIRE!".
         */
        
        
        
        /*
         * WARNING: Ternary operators can be used to improve the readability of
         * your code if used sparingly for very simple if/else statements.
         * 
         * However, if you have nested Ternary statements or more complex if/else
         * statements please use switch statements or normal if/else statements
         * for the sake of all who must read your code.
         */

    }

}
