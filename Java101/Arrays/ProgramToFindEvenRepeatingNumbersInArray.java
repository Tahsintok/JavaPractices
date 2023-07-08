package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ProgramToFindEvenRepeatingNumbersInArray {

    static boolean isFind(int[] arr, int value){
        for (int i: arr){
            if(i== value) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] Arrays1 = {5,-20,45,62,-84,21,39,82,36,-20,62,62,62,-84,39,39,5};
        int[] duplicate = new int[Arrays1.length];
        int startIndex = 0;
        for(int i=0; i<Arrays1.length; i++) {
            for (int j =0; j<Arrays1.length; j++){
                if ((i != j) && (Arrays1[i] == Arrays1[j]) && Arrays1[i]%2 ==0){
                    if (!isFind(duplicate, Arrays1[i])){
                    duplicate[startIndex++] = Arrays1[i];
                    
                    }
                break;
                }
            }
        }
        for (int value : duplicate){
            if (value != 0){
                System.out.println(value);
            }
        }

    
    }
}
