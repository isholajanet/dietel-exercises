package ChapterTwo;

import java.util.Scanner;

public class Question13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();
        System.out.println("Enter the third number: ");
        int num3 = input.nextInt();
        System.out.println("Enter the fourth number: ");
        int num4 = input.nextInt();
        System.out.println("Enter the fifth number: ");
        int num5 = input.nextInt();

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        if (num1 > 0 ) {
            positiveCount++;
        } else if( num1 < 0){
            negativeCount++;
        }else{
            zeroCount++;
        }

        if (num2 > 0 ) {
            positiveCount++;
        } else if( num2 < 0){
            negativeCount++;
        }else{
            zeroCount++;
        }

        if (num3 > 0 ) {
            positiveCount++;
        } else if( num3 < 0){
            negativeCount++;
        }else{
            zeroCount++;
        }

        if (num4 > 0 ) {
            positiveCount++;
        } else if( num4 < 0){
            negativeCount++;
        }else{
            zeroCount++;
        }

        if (num5 > 0 ) {
            positiveCount++;
        } else if( num5 < 0){
            negativeCount++;
        }else{
            zeroCount++;
        }

        System.out.println("The positive count is " +positiveCount);
        System.out.println("The negative count is " +negativeCount);
        System.out.println("The zero count is " +zeroCount);
    }
}
