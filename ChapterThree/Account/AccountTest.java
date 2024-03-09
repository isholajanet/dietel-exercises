package ChapterThree.Account;

import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {

        Account account = new Account("Janet Ishola", 50.00);

        System.out.printf("%s balance: $%.2f%n", account.getName(), account.getBalance());
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the deposit amount: ");
        double depositAmount = input.nextDouble();

        account.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f%n", account.getName(), account.getBalance());

        System.out.println("Enter the withdraw amount: ");
        double withdrawAmount = input.nextDouble();

        account.withdraw(withdrawAmount);

        System.out.printf("%s balance: $%.2f%n", account.getName(), account.getBalance());


    }
}
