import java.util.Scanner;

public class CalculatingSumOfDigitValueOfNumber {
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.println("Enter the Number");
        int number=inp.nextInt(),tempNumber=number;

        tempNumber=number;
        int sumOfdigitValue=0;
        while (tempNumber != 0){
            int digitValue =tempNumber % 10;
            tempNumber /=10;;
            sumOfdigitValue += digitValue;
        }
        System.out.println("Sum of Digit Values: "+sumOfdigitValue);
        
    }
}


