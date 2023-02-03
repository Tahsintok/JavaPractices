import java.util.Scanner;
public class HoroscopeFinder {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int ay,gun;
        String burc;

        burc="";
        System.out.print("Dogdugunuz günü girin :");
        gun=inp.nextInt();
        
        System.out.print("Dogdugunuz ayi girin :");
        ay=inp.nextInt();

        if (((gun>21 && ay ==12) && (31 >= gun && ay <=12))  || (gun<=19 && ay==1)){
            burc="Oglak";
        }
        else if (((gun>20 && ay ==1) && (31 >= gun)) || (gun<=18 && ay==2)){
            burc="Kova";
        }
        else if (((gun>19 && ay ==2) && (29 >= gun)) || (gun<=20 && ay==3)){
            burc="Balık";
        }
        else if (((gun>21 && ay ==3) && (31 >= gun)) || (gun<=20 && ay==4)){
            burc="Koc";
        }
        else if (((gun>21 && ay ==4) && (30 >= gun)) || (gun<=20 && ay==5)){
            burc="Boga";
        }
        else if (((gun>21 && ay ==5) && (31 >= gun)) || (gun<=20 && ay==6)){
            burc="İkizler";
        }
        else if (((gun>21 && ay ==6) && (31 >= gun)) || (gun<=20 && ay==7)){
            burc="Yengec";
        }
        else if (((gun>21 && ay ==7) && (31 >= gun)) || (gun<=20 && ay==8)){
            burc="Aslan";
        }
        else if (((gun>21 && ay ==8) && (30 >= gun)) || (gun<=22 && ay==9)){
            burc="Basak";
        }
        else if (((gun>23 && ay ==9) && (31 >= gun)) || (gun<=20 && ay==10)){
            burc="Terazi";
        }
        else if (((gun>21 && ay ==10) && (30 >= gun)) || (gun<=22 && ay==11)){
            burc="Akrep";
        }
        else if (((gun>23 && ay ==11) && (31 >= gun)) || (gun<=20 && ay==12)){
            burc="Yay";
        }
        else {
            System.out.print("Hatalı Giriş");
        }
        if (burc != ""){
        System.out.print("Burcunuz :"+ burc);
        }

    }
}
