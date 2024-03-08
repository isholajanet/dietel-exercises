package ChapterTwo;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = input.nextInt();

        int dig5 = num % 10;
        int mod5 = num / 10;
        int dig4 = mod5 % 10;
        int mod4 = mod5 /10;
        int dig3 = mod4 % 10;
        int mod3 = mod4 / 10;
        int dig2 = mod3 % 10;
        int mod2 = mod3 / 10;
        int dig1 = mod2 % 10;

        System.out.println(dig1 + "  " + dig2 + "  " +dig3+ "  " + dig4 + "  " + dig5);

    }
}
