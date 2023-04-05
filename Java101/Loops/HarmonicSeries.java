import java.util.Scanner;


public class HarmonicSeries {
 
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=inp.nextInt();
        double result=0;
//finding harmonic series of n
        for (double i=1;i<=n;i++){
            result += (1/i);
        }
    System.out.println(result);
    }

}
