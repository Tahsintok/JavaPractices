import java.util.Scanner;
import java.util.Arrays;

public class FindingMatrixTranspose {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("m :");
        int m=inp.nextInt();
        System.out.println("k :");
        int k=inp.nextInt();


 
        int[][] matrix = new int[m][k];

        for (int i=0; i<m; i++){
            for(int j=0; j<k; j++){
                System.out.println("i : "+i+" J : "+j+" = ");
                int number = inp.nextInt();
                matrix[i][j] = number;

            }
        }
        // assign transpose elements 
        int[][] transposeMatrix = new int[k][m];
        for (int i =0; i<m;i++){
            for(int j =0; j<k;j++){
                transposeMatrix[j][i]=matrix[i][j];
            }
        }

        //printing matrix
        System.out.println("Matrix : ");
        for (int i=0;i<m;i++ ){
            for (int j=0; j<k; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
       
       //printing transpose matrix
       
        System.out.println("Transpose Matrix : ");
        for (int i =0; i<k;++i){
            for(int j=0;j<m;++j){
                System.out.print(transposeMatrix[i][j]+ "\t");
            }
            System.out.println();
        }
    }
}
