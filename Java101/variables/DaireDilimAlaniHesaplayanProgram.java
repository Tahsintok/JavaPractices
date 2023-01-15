import java.util.Scanner;;
public class DaireDilimAlaniHesaplayanProgram {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double yaricap,merkezAciÖlcüsü,piSayisi=Math.PI, dilimAlani;
        
        System.out.print("Yarıçapı giriniz:");
        yaricap=input.nextDouble();

        System.out.print("Merkez Açı Ölçüsü Giriniz");
        merkezAciÖlcüsü=input.nextDouble();

        dilimAlani=(piSayisi*(Math.pow(yaricap,2)*merkezAciÖlcüsü))/360;
        System.out.print("Dilim Alani: "+dilimAlani);
    }

}
