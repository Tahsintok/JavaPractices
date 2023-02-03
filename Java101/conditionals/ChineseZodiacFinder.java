import java.util.Scanner;

public class ChineseZodiacFinder {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int dogumYili,kalan;
        String burc="";
        boolean isError = false;

        System.out.print("Doğum Yılınızı Giriniz : ");
        dogumYili=inp.nextInt();
        
        // Burcu bulma blogu
        if (dogumYili >= 0 ){
            kalan=(dogumYili % 12);
            switch (kalan) {
                case 0:
                    burc="Maymun";
                    break;
                case 1:
                    burc="Horoz";
                case 2:
                    burc="Köpek";
                case 3:
                    burc="Domuz";
                case 4:
                    burc="Fare";
                case 5:
                    burc="Öküz";
                case 6:
                    burc="Kaplan";
                case 7:
                    burc="Tavşan";
                case 8:
                    burc="Ejderha";
                case 9:
                    burc="Yılan";
                case 10:
                    burc="At";
                case 11:
                    burc="Koyun";
                default:
                    break;
            }
        }else{
            isError=true;
        }
        if (burc != ""){
            System.out.print("Çin Zodyağı Burcunuz : "+ burc);
        }else{
            System.out.print("Hatalı Doğum Yılı Girişi !");
        }
    }
}