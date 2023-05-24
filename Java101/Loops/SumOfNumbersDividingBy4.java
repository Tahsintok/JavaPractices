import java.util.Scanner;

public class SumOfNumbersDividingBy4 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, total=0;

        
        do{
            System.out.print("Enter Number :");
            n = input.nextInt();
            if ( n % 4 == 0){
                total += n;
            }
        }while (n % 2 == 0);
        
        System.out.println("Sum : " + total);
    }
}
