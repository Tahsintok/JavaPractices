import java.util.Scanner;

public class MethodByPattern {
   public static int decrease(int x){
   
    if(x<=0){
        return x;
    }
    System.out.print(x + "\t");
    return decrease(x-5);
    
}
public static int increase(int x, int minimumNumber){
    System.out.print(x + "\t");
    if(x== minimumNumber){
        return x;
    }
    return increase(x+5,minimumNumber);
    
}
public static void main(String[] args) {
    
    Scanner inp = new Scanner(System.in);
    System.out.print("Enter number: ");
    int number = inp.nextInt();
    System.out.print("Serie of N :");
    int lowestpoint= decrease(number);
    increase(lowestpoint, number);
    }
   } 

