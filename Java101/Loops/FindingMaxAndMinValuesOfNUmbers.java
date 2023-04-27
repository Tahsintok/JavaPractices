import java.util.Scanner;

public class FindingMaxAndMinValuesOfNUmbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the counts of numbers :");
        int n = inp.nextInt();
        
        //set the min and max integer value to min and max variables.
        int min = Integer.MAX_VALUE;
        int max =Integer.MIN_VALUE;
       
        for(int i=1;i<=n;i++){
            System.out.println(i +". number :");
            int m= inp.nextInt();

            //selecting the smallest number
            if(m<min){
                min = m;
            }
            //selecting the biggest number
            if(m> max){
                max = m;
            }
        }
        System.out.println("Biggest number is : "+max);
        System.out.println("Smallest number is : "+min); 
       

    }
}
