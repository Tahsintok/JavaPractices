import java.util.Scanner;

public class ActivityOffer {
    

    public static void main(String[] args) {
        int heat;

        Scanner inp = new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz :");
        heat = inp.nextInt();

        if (heat < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (heat <= 25) {
            if (heat >= 5 && heat < 10 ) {
                System.out.println("Sinemaya gidebilirsiniz.");
            }
            else if (heat >= 10 && heat <=15 ){
                System.out.println("Pikniğe,Sinemaya gidebilirsiniz.");
            }else {
                System.out.print("Pikniğe gidebilirsin.");
            }
            }
        
        else {
            System.out.println("Yüzmeye gidebilirsiniz.");

        }
    }
}
