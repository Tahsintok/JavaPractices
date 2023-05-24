import java.time.YearMonth;
import  java.util.Scanner;

public class CombinationCalculator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Number of Elements : ");
        int n = inp.nextInt();
        // r is elements number of r-combination
        System.out.print("Number of Elements to be selected from Set: ");
        int r = inp.nextInt();
        int nFactorial=1,n_rFactorial=1, rFactorial=1;
        
        for (int i =1;i <= n; i++){
            nFactorial*= i;

            if (i==r){
                rFactorial*=nFactorial;
            }
            if (i==n-r){
                n_rFactorial=nFactorial;
            }
        
        }
        int combination= nFactorial/(rFactorial*n_rFactorial);
        System.out.println("Combination of n :" + combination);
        
    }
}
