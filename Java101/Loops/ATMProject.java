
import java.util.Scanner;
public class ATMProject {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        String userName, password;
        int right=3;
        int balance =1500;
        int select, price;
        while(right>0) {
            System.out.print("Enter your Username : ");
            userName = inp.nextLine();
            System.out.print("Enter your Password : ");
            password = inp.nextLine();
            if (userName.equals("example") && password.equals("1234")){
                System.out.println("Hello, Welcome Bank your Account");
                do {
                    System.out.println("1-Deposit Money\n"+
                            "2-Withdraw Money\n" +
                            "3-Check Balance\n" +
                            "4-Exit");
                    System.out.println("Please Select your Transaction : ");
                select = inp.nextInt();
                switch(select){
                    case (1):
                    System.out.println("Please Select the Amount : ");
                    price = inp.nextInt();
                    balance += price;
                    break;
                    case (2):
                    System.out.println("Please Select the Amount : ");
                    price = inp.nextInt();
                        if (price > balance) {
                            System.out.println("Insufficient Funds in your Account");
                    }   else {
                            balance -= price;
                    }break;
                    case (3):
                    System.out.println("Your Balance : "+balance);
                    break;
                    }
                }while (select != 4);
                System.out.println("Bye");
            }else{
                right--;
                System.out.println("Entered wrong username or password,try again");
            
                if (right==0){
                    System.out.println("Your account are blocked.Please contact your Bank. ");
                }else{
                    System.out.println(right+ " Attemps left");
                }
            }

                
            }

        }
    }




