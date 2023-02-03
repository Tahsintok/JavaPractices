import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
        int n1,n2,select;
        Scanner inp = new Scanner(System.in);

        System.out.println("İlk Sayıyı Giriniz : ");
        n1 = inp.nextInt();
        
        System.out.println("İkinci Sayıyı Giriniz : ");
        n2 = inp.nextInt();
        
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        select = inp.nextInt();

        switch (select) {
            case 1:
                System.out.print("Toplam : "+(n1+n2));
                break;
            case 2:
                System.out.print("Çıkarma : "+(n1-n2));
                break;
            case 3:
                System.out.print("Çarpma : "+(n1*n2));
                break;
            case 4:
                if (n2!=0){
                    System.out.print("Bölme : "+(n1/n2));
                break;
                }else {
                    System.out.print("Bir sayı 0'a Bölünemez");
                }
                break;
            default:
                System.out.print("Yanlış seçim yaptınız.Tekrar deneyiniz.");
                break;
        }


        
    }
}
