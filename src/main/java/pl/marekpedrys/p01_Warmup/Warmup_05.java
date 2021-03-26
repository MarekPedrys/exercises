// Warmup_05.
// Write a public method printTree. Method needs to print a christmas tree using for loops.

package pl.marekpedrys.p01_Warmup;

public class Warmup_05 {
    public static void main(String[] args) {
       printTree();
    }

    public static void printTree() {

        for (int row = 0; row < 15; row++) {
            for (int spaceCount = 0; spaceCount <  14- row; spaceCount++) {
                System.out.print(" ");
            }

            for (int asteriskCount = 0; asteriskCount < 1+2*row; asteriskCount++) {
                System.out.print("*");
            }

            System.out.println();

        }

        for (int row = 0; row < 3; row++) {
            for (int spaceCount = 0; spaceCount < 13; spaceCount++) {
                System.out.print(" ");
            }
            for (int asteriskCount = 0; asteriskCount < 5; asteriskCount++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
