import java.util.Scanner;
public class VucutKitleEndeksiHesaplamaProrami {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double boy,kilo,index;

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy=inp.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo=inp.nextDouble();

        index=kilo/(Math.pow(boy,2));
        System.out.print("Vücut Kitle İndeksiniz : "+index);
    }


}
