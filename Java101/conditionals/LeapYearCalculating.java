import java.util.Scanner;


public class LeapYearCalculating {
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int yil;

        System.out.print("Yılı Giriniz : ");
        yil = inp.nextInt();

        if (yil % 100 != 0){
            if (yil % 4 == 0){
                System.out.print(yil + " artık bir yıldır.");
            }else{
                System.out.println(yil + " artık bir yıldır degildir.");

            }
        }else{
            if (yil % 400 ==0){
               System.out.print(yil + " artık bir yıldır.");
            }else {
                System.out.print(yil + " artık bir yıldır degildir.");
            }
        }
    }
}
