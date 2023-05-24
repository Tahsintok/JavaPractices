import java.util.Scanner;


public class PowerCalculator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Enter Base Number :");
        int n = inp.nextInt();
        System.out.print("Enter Power Number :");
        int l = inp.nextInt(),result=1;

        for (int i =1; i<=l;i++){
        result *= n;
        }
        System.out.println(result);
        }
    }
    


