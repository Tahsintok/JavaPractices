import java.util.Scanner;
public class KDVhesaplayanProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kdvsizFiyat,kdvliFiyat,kdvTutari;
        
        System.out.println("KDV'siz fiyatını giriniz");
        kdvsizFiyat = input.nextDouble();

        kdvliFiyat = (0 < kdvsizFiyat) && (kdvsizFiyat <1000) ? kdvsizFiyat*1.18 : kdvsizFiyat*1.08;
        kdvTutari =(0 < kdvsizFiyat) && (kdvsizFiyat <1000) ? kdvsizFiyat*0.18 : kdvsizFiyat*0.08;

        System.out.println("KDV'siz Fiyatı " + kdvsizFiyat);
        System.out.println("KDV'li Fiyatı " + kdvliFiyat);
        System.out.println("KDV Fiyatı " + kdvTutari);

    }
}