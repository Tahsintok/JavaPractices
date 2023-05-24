
import java.util.Scanner;


public class FlightTicketPrice {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int yas, mesafe,yolculukTipi;
        double normalTutar=0,yasIndirimi=0,indirimliTutar=0,gidisDönüsIndirimi=0,toplamTutar=0;
        boolean isError= false;
        System.out.print("Mesafeyi km türünden giriniz :");
        mesafe=inp.nextInt();
        System.out.print("Yaşınızı giriniz :");
        yas=inp.nextInt();
        System.out.print("Yolculuk Tipi Giriniz (1 => Tek Yön, 2 >= Gidiş Dönüş) :");
        yolculukTipi=inp.nextInt();
        
        // Normal tutar hesabı
        if (mesafe > 0){
            normalTutar=(mesafe * 0.10);
        }else {
            isError=true;
        }
        //Yas indirimi
        if (yas >=0 ){
            if (yas < 12) {
            yasIndirimi=normalTutar*0.50;
            }else if ((yas >= 12) && (yas <=24)) {
            yasIndirimi=normalTutar*0.10;
            }else if (yas > 65){
            yasIndirimi=normalTutar*0.30;
            }
            indirimliTutar=normalTutar-yasIndirimi;
        }else {
            isError=true;
        }
        

        //Gidis Dönüs indirimi
        if ((yolculukTipi==2 ) || (yolculukTipi==1 )) {
            if (yolculukTipi==2 ){
                gidisDönüsIndirimi=indirimliTutar*0.20;
                toplamTutar=(indirimliTutar-gidisDönüsIndirimi)*2;
            }else {
                gidisDönüsIndirimi=0;
                toplamTutar=(indirimliTutar-gidisDönüsIndirimi);
            }
        }else{
            isError=true;
        }

        //print
        if (isError==false){
            System.out.printf("Toplam Tutar = %.1f TL",toplamTutar);
        }else{
            System.out.print("Hatalı Giriş Yaptınız");
        }
             
    }
}

