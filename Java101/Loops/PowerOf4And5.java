import java.util.Scanner;

public class PowerOf4And5 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n;
        System.out.print("Enter the limit value :");
        n = inp.nextInt();
        
        int pow4 = 1, pow5 = 1;
        while (pow4 <= n || pow5 <= n) {
            if (pow4 <= pow5 && pow4 <= n) {
                System.out.print(pow4 + " ");
                pow4 *= 4;
            } else if (pow5 <= n) {
                if (pow5 != 1){
                    System.out.print(pow5 + " ");
                }
                pow5 *= 5;
            }
        }
        
    }
}
