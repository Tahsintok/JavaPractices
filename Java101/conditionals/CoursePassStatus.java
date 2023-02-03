import java.util.Scanner;

public class CoursePassStatus {
    
    public static void main(String[] args) {
        
        int mat,fizik,turkce,kimya,muzik;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Türkçe notunuz : ");
        turkce = inp.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Müzik notunuz : ");
        muzik = inp.nextInt();

        //Not aralığı (0,100) arasında ise ortalamaya alınnır
        mat = (mat >= 0 && mat <= 100) ? mat : 0;
        fizik = (fizik >= 0 && fizik <= 100) ? fizik : 0;
        turkce = (turkce >= 0 && turkce <= 100) ? turkce : 0;
        kimya = (kimya >= 0 && kimya <= 100) ? kimya : 0;
        muzik = (muzik >= 0 && muzik <= 100) ? muzik : 0;
    
        double average= (double)(mat+fizik+turkce+kimya+muzik)/5;
        if (average <= 55){
            System.out.println("Sınıfta kaldinız, seneye görüşmek üzere !");
        }else{
        System.out.println("Sınıfta kaldinız, seneye görüşmek üzere !");
        }
        System.out.printf("Ortalamanız : %.1f",average);
    
    
    
    }
}
