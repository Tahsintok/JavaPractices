
import java.util.Scanner;

public class FibonacciRecursive {
 
    //this method finds sum of fibonacci series up to the n steps using recursive method.
     static int fib(int n){

        if (n == 1 || n==2){
            return 1;
        }
        return fib(n-2)+fib(n-1);   
    }
    public static void main(String[] args) {
        System.out.println(fib(7));
    }
}