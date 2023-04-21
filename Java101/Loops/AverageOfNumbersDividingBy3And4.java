import java.util.Scanner;


public class AverageOfNumbersDividingBy3And4 {
     
    public static void main(String[] args) {
        int k,sum=0,counting=0;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a integer : ");
        k = input.nextInt();

        for (int i = 1; i <= k; i++) {
            if (i%3 == 0 && i%4 == 0) {
                sum += i;
                counting++; 
            }
            }            
        
        if (counting !=0){
            double average = (sum / counting);
            System.out.println(average);
        }else{
            System.out.println("there are no least common multiple");
        }
    }    
    
}