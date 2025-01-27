import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
     
         Scanner sc = new Scanner(System.in);
 
        System.out.print(
            "Enter the first and the Second number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        double result;

             result = num1 + num2;
            System.out.println("Addition: " + result);
     
            result = num1 - num2;
            System.out.println("Subtraction: " + result);
     
            result = num1 * num2;
            System.out.println("Multiplication: " + result);

        if(num1 != 0 && num2 != 0) {
            result = (double) num1 / num2;
            System.out.println("Division: " + result);
        }
        else{
            System.out.print("It is not possible to divide by 0!!");
        }
            
    }
}