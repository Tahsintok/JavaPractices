
import java.util.Scanner;
import java.util.Arrays;

public class ProgramSortingElementsInArrayFromSmallestToLargest {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int[] Arrays1 = new int[inp.nextInt()];
        System.out.println("Enter the elements of Array : ");

        for (int i =0; i <Arrays1.length; i++){
            System.out.print((i+1)+". Element : ");
            Arrays1[i] = inp.nextInt();
        }
        System.out.println(" ");


        Arrays.sort(Arrays1);
        System.out.print("Sorted List : ");
        for (int a : Arrays1) {
            System.out.print(a+" ");
        }

    }
    
}