
import java.util.Scanner;
public class PrintingInvertedTriangleShapes {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter number of steps: ");
        int n= inp.nextInt();

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
