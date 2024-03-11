package ChapterFour;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int accountNumber;
        int balance = 0;
        int charges = 0;
        int credits = 0;
        int creditLimit = 0;
        int newBalance = 0;

        System.out.print("Enter the user account number: ");
        accountNumber = input.nextInt();
        System.out.print(" Enter the balance at the beginning of the month: ");
        balance = input.nextInt();
        System.out.print("Enter the total of all items charged by the customer this month: ");
        charges = input.nextInt();
        System.out.print("Enter the total of all the credits applied to the cusotmer's account this month: ");
        credits = input.nextInt();
        System.out.print("Enter the allowed credit limit: ");
        creditLimit = input.nextInt();

        while (newBalance < creditLimit){

            newBalance = balance + charges - credits;

            if ( newBalance > creditLimit) {
                System.out.println("credit limit exceeded...");
            }

        }


    }
}
