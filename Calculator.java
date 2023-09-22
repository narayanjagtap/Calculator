package Projects;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter frist number...");
        int num1 = scan.nextInt();

        System.out.println("Enter a calculate operators (+, -, *, /) ...");
        char operator = scan.next().charAt(0);

        System.out.println("Enter second number...");
        int num2 = scan.nextInt();

        if (operator == '+' ){
            int result = num1 + num2;
            System.out.println("Result is " + result);
        }
        else if(operator == '-'){
            int result1 = num1 - num2;
            System.out.println("Result is " + result1);
        }
        else if(operator == '*'){
            int result2 = num1 * num2;
            System.out.println("Result is " + result2);
        }
        else if(operator == '/'){
            int result3 = num1 / num2;
            System.out.println("Result is " + result3);
        }
        else{
            System.out.println("Enter valid Operator...");
        }
    }
}
