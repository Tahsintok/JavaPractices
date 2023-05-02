import java.util.Scanner;
public class FindingFibonacciSeriesProgram {
    public static void main(String[] args) {
        System.out.println("Enter the fibonacci series length : ");
        Scanner inp = new Scanner(System.in);
        int n=inp.nextInt(),result,value1=0,value2=1;
        
         for (int i=1;i<=n;i++){
            if(i==1){
                result=0;
            }else if(i==2){
                result=1;
                value1=1;
            }else if (i==3){
                result=1;
                value2=result;
            }else {
                result=value1+value2;
                value1=value2;
                value2=result;

            }
            
            System.out.println(result);
            }
            
    }
}
