import java.util.Scanner;

public class PrintingPrimeNumbersUpTo100 {
   public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int n =100,notPrime=0;
    // i and k begin from 2 because 1 is not prime number.
    for (int i=2; i<n;i++){
    
        for(int k=2;k<i;k++){
            if (i%k==0){
                notPrime ++;
            }
            
        }
        if (notPrime == 0){
            System.out.println(i+" ");
            }
        notPrime=0;

    } 
}
}


