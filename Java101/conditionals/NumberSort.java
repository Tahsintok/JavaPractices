import java.util.Scanner;


public class NumberSort {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a,b,c;
        System.out.print("1.Sayı Giriniz :");
        a = inp.nextInt();
        System.out.print("2.Sayı Giriniz :");
        b = inp.nextInt();
        System.out.print("3.Sayı Giriniz :");
        c = inp.nextInt();

        if ((a<c) && (a<b)){
            if (b<c){
                System.out.print("a<b<c");
            }else{
                System.out.print("a<c<b");
            }
        }
        else if ((c<b) && (c<a)){
            if (b<a){
                System.out.print("c<b<a");
            }else {
                System.out.print("c<a<b");               
            }
        }
        else {
            if (c<a) {
                System.out.print("b<c<a");
            }
            else {
                System.out.print("b<a<c");
            }
            
        }
        
    
        
        


    }
}
