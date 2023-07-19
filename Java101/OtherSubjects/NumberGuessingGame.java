import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;


public class NumberGuessingGame {
    
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        //number is produced randomly between 0 and 100.
        //int number =(int) (Math.random() * 100);
        System.out.println(number);

        Scanner inp = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong =new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println(number);
        while (right < 5){
            System.out.println("Enter your Guess : ");
            selected =inp.nextInt();

        if (selected < 0 || selected > 99) {
            System.out.print("Enter a value between 0-100");
            if (isWrong) {
                right++;
                System.out.println("Entered wrong entries.Remaining right : " + (5-right));
            }else{
                isWrong =true;
                System.out.println("Your next wrong entry will be deducted from you.");
            }
            continue;
        }
        if (selected == number) {
            System.out.println("Congratulations, guessed right! Number you guessed : "+ number);
            isWin = true;
            break;
        }else {
            System.out.println("You entered an wrong number");
            if (selected > number) {
                System.out.println(selected + " number is greater than the hidden number.");
            } else {
                System.out.println(selected + " number is less than hidden number.");
            }

            wrong[right++] = selected;
            System.out.println("Remaining Try : " + (5 - right));
            }
        }

         if (!isWin) {
             System.out.println("Lose ! ");
             if (!isWrong) {
                 System.out.println("Your Guesses : " + Arrays.toString(wrong));
             }
         }
    }
}

