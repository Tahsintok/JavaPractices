import java.util.Scanner;
import java.util.Arrays;


public class FindingElementFrequencyProgram {
    static boolean isControl(int[] arr, int value){
        for (int i: arr){
            if(i== value) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[] Arrays1 = {5,-20,45,62,-84,21,39,82,36,-20,62,62,62,-84,39,39,5};
        int[] ArrayUnrepeat = new int[Arrays1.length];
        int index = 0, count = 1;
        for(int i=0; i<Arrays1.length; i++) {
            for (int j =0; j<Arrays1.length; j++){
                if ((i != j) && (Arrays1[i] == Arrays1[j])){
                    count ++;
                }
            }
        
            if (!isControl(ArrayUnrepeat, Arrays1[i])){
                System.out.println( "Element " + Arrays1[i] + " are repeated " + count + " times");
                ArrayUnrepeat[count++] = Arrays1[i];
            }
            count =1;
        }    
    }
}
