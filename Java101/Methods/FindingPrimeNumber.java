import java.util.Scanner;

public class FindingPrimeNumber {
    public static void main(String[] args) {
    Scanner inp= new Scanner(System.in);
    System.out.println("Enter a number");
    int a=inp.nextInt();
    System.out.println(a+ IsPrimeNumber(a));

    }
    public static String IsPrimeNumber(int a){
    int counter=0;
    for(int i=2;i<a;i++){
        if(a % i ==0){
            counter ++;
        }
    }
        if (counter>0){
        return " is not prime number";
    }else {
        return " is prime number";
    
}
}

}
