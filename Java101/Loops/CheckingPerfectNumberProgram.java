
import java.util.Scanner;
public class CheckingPerfectNumberProgram {
   //this program checks whether the entered number is perfect number or not.
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = inp.nextInt();
        int sumOfDivisor=0;
        for (int i=1; i<n; i++){
            if (n%i==0){
                sumOfDivisor +=i;
            }
        }
        if (sumOfDivisor == n){
            System.out.println(n+" is a perfect number");
        }else{
            System.out.println(n+" is not a perfect number"); 
        }
    }
}
