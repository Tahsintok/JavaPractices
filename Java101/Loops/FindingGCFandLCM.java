

import java.util.Scanner;
public class FindingGCFandLCM {
   
     public static void main(String[] args) {
    //this program finds the greatest common factor (GCF) and Least common multiple(LCM) of n1 and n2.
        Scanner inp= new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = inp.nextInt();
        System.out.print("Enter second number: ");
        int n2 = inp.nextInt();
        int GCF=0,LCM=0;
        if (n1 >= n2){
            int i=n2,k=n1;
            while (i>= 1){
                
                if (n2%i==0 && n1%i==0){
                    GCF = i;
                    break;
                    }
                i--;
            }
            while (k>=n1){
                
                if (k%n2==0 && k%n1==0){
                    LCM = k;
                    break;
                    }
                k++;
            }
        
        }else {
            int i=n1,k=n2;
            while (i>= 1){
                
                if (n1%i==0 && n2%i==0){
                    GCF = i;
                    break;
                    }
                i--;
            }
            while (k>=n2){
                
                if (k%n2==0 && k%n1==0){
                    LCM = k;
                    break;
                }
                k++;
            }

        }
        System.out.println("Greatest common factor (GCF) is :"+GCF);
        System.out.println("Least common multiple(LCM) is :"+LCM);
    }
}
