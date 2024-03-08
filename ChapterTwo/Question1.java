package ChapterTwo;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;


        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        firstNumber = input.nextInt();
        System.out.print("Enter the second number: ");
        secondNumber = input.nextInt();

        int sum = firstNumber + secondNumber;
        int diff = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        int div = firstNumber / secondNumber;

        System.out.println("The sum is: " + sum);
        System.out.println("The diff is: " + diff);
        System.out.println("The product is: " + product);
        System.out.println("The div is: " + div);

    }
}
