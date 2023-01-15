import java.util.Scanner;
public class UcgenAlaniHesaplayanProgram {

    

    


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kenar1,kenar2,kenar3,udegeri,alan;
        
        System.out.println("Brinci Kenar uzunluğunu giriniz");
        kenar1 = input.nextDouble();

        System.out.println("İkinci Kenar uzunluğunu giriniz");
        kenar2 = input.nextDouble();

        System.out.println("Üçüncü Kenar uzunluğunu giriniz");
        kenar3 = input.nextDouble();
        
        udegeri=(kenar1+kenar2+kenar3)/2;
        alan=Math.sqrt(udegeri*(udegeri-kenar1)*(udegeri-kenar2)*(udegeri-kenar3));
        
        System.out.println("Üçgenin Alanı:"+alan);
    
    
    }
}
