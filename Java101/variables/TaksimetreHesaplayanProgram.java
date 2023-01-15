import java.util.Scanner;


public class TaksimetreHesaplayanProgram {

    public static void main(String[] args) {
    Scanner giris = new Scanner(System.in);
    double mesafe,tutar,birimTutari=2.20;

    System.out.print("Gidilen Mesafeyi Giriniz(KM): ");
        mesafe = giris.nextDouble();

    tutar=((mesafe*birimTutari+10 >= 20) ? (mesafe*birimTutari +10) : 20);
    System.out.println("Taksimetre Ücreti: "+tutar);

    }
}
