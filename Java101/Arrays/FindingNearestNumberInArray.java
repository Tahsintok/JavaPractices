
import java.util.Arrays;
import java.util.Scanner;
public class FindingNearestNumberInArray {
    public static void main(String[] args) {
        int[] list1 ={54,35,3,7,105,-40,-55};

        //code will show the nearest numbers to  entered number integer in array
        Scanner inp = new Scanner(System.in);
        System.out.println("Array : "+ Arrays.toString(list1));


       System.out.println("Enter a number");
       int num = inp.nextInt();
        
       Arrays.sort(list1);


        for (int k : list1) {
            if (k > num ){
                //the situation where the selected number is less than all the numbers in the list.
                if(list1[0] ==k){
                    System.out.println("The closest number greater than the entered number: "+ k);
                //the situation where the selected number is between two numbers in the list.
                break;
                }else
                System.out.println("The closest number greater than the entered number: "+ k);
                System.out.println("The closest number smaller than the entered number: " + list1[Arrays.binarySearch(list1,k)-1]);
                break;
            //the situation where the selected number is between two numbers in the list.    
            } else if (list1.length ==( Arrays.binarySearch(list1,k)+1)) {
                System.out.println("The closest number smaller than the entered number: "+ k);
            }
           
        
         }
    }
}
