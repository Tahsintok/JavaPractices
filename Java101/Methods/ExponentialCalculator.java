
import java.util.Scanner;


public class ExponentialCalculator {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter Base number");
        int n=inp.nextInt();
        System.out.println("Enter Exponent number");
        int i=inp.nextInt();
        System.out.println(f(i,n));
    }
    public static int f(int i,int n) {
        if (i==0){
            return 1;
        }else{
            return n*f(i-1,n); 
        }
    }
}
