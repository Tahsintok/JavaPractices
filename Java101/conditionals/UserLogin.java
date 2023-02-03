import java.util.Scanner;

public class UserLogin {
    

    public static void main(String[] args) {
     
        Scanner inp = new Scanner(System.in);
        String userName, password;

        System.out.print("Kullanıcı Adınız : ");
        userName=inp.nextLine();
        System.out.print("Şifreniz : ");
        password=inp.nextLine();
 
        //Sifre ve kullanıcı adını kontrol eder
        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız !");
        }
        //sadece sifre yanlıs olma durumu
        else if (userName.equals("patika") && !(password.equals("java123"))) {
            System.out.println("Şifre yanlis !");


            System.out.print("Yeni şifre oluşturmak ister misiniz ? (evet veya hayır):");
            String check = inp.nextLine();
            
            //yeni sifre olusturma
            if (check.equals("evet")) {
                System.out.print("Yeni Şifreniz :");
                String newPassword = inp.nextLine();
                
                String sonuc = newPassword.equals("java123") ? "Şifre oluşturulamadı, lütfen başka şifre giriniz" : "Şifre oluşturuldu";
                System.out.print(sonuc);

            }
            else{
                System.out.println("İyi Günler !");
            }

               
        }
        else{
            System.out.print("Bilgileriniz hatalı !");
        }
            
     }
}
