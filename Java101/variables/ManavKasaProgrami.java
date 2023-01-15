import java.util.Scanner;
public class ManavKasaProgrami {
 
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double armut,elma,domates,muz,patlican,toplam;
        double armutFiyat=2.14,elmaFiyat=3.67,domatesFiyat=1.11,muzFiyat=0.95,patlicanFiyat=5;

        System.out.print("Armut kaç kilo? : ");
        armut=inp.nextDouble();

        System.out.print("Elma kaç kilo? : ");
        elma=inp.nextDouble();

        System.out.print("Domates kaç kilo? : ");
        domates=inp.nextDouble();

        System.out.print("Muz kaç kilo? : ");
        muz=inp.nextDouble();

        System.out.print("Patlican kaç kilo? : ");
        patlican=inp.nextDouble();

        toplam=armut*armutFiyat+elma*elmaFiyat+domates*domatesFiyat+muz*muzFiyat+patlican*patlicanFiyat;
        System.out.print("Toplam Tutar : "+toplam);

    }
}
