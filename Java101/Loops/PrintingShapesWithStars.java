
import java.util.Scanner;

public class PrintingShapesWithStars {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a number of steps");
        int n = inp.nextInt();

         for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = n-1; i >= 0 ; i--) {
            for (int j = (n-i-1); j >= 0; j--) {
                System.out.print(" ");
            }
            for (int k = (2*i); k >=0; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}


