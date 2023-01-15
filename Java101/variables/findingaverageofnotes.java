import java.util.Scanner;
public class findingaverageofnotes {

    


    //koşul ifadeleri ile not ortalaması 60'dan büyükse geçti değilse kaldı yaz(koşul ifadesiyle)
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, fizik, kimya, turkce, tarih, muzik; 

        System.out.println("matematik notunu giriniz:");
        mat=input.nextInt();

        System.out.println("fizik notunu giriniz:");
        fizik=input.nextInt();

        System.out.println("kimya notunu giriniz:");
        kimya=input.nextInt();

        System.out.println("turkce notunu giriniz:");
        turkce=input.nextInt();

        System.out.println("tarih notunu giriniz:");
        tarih=input.nextInt();

        System.out.println("muzik notunu giriniz:");
        muzik=input.nextInt();

        double ortalama = (mat+fizik+kimya+turkce+tarih+muzik)/6;
        String sonuc= ortalama >= 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(sonuc);


    }

}

