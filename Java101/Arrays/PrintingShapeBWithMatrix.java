import java.util.Scanner;
import java.util.Arrays;

public class PrintingShapeBWithMatrix {
    public static void main(String[] args) {
        
    
    
    String[][] Arrays1 = new String[7][5];

     for (int i=0 ;i<Arrays1.length; i++ ){
         for( int j=0; j<Arrays1[i].length; j++){
               if((i ==0 || i==3 || i ==6) && (j!=4)){
                  Arrays1[i][j]= "*" ;
                }else if( j==0){
                   Arrays1[i][j]= "*";
                 }else if ((j==4) && (i!=0 && i!=3 && i!=6 )){
                   Arrays1[i][j]= "*";
             }else {
                     Arrays1[i][j]= " ";
                }
            }
        }
        for (String[] row:Arrays1) {
            for(String column: row){
                System.out.print(column);
            }
            System.out.println();
        }

    }

}
