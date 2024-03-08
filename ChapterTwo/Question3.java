package ChapterTwo;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNum = input.nextInt();
        System.out.print("Enter the second number: ");
        int secondNum = input.nextInt();
        System.out.print("Enter the third number: ");
        int thirdNum = input.nextInt();

        int sum = firstNum+secondNum+thirdNum;
        int product = firstNum * secondNum * thirdNum;
        System.out.println("The sum is " +sum);
        System.out.println("The average is " + (sum/3));
        System.out.println("The product is " + product);
        System.out.println("The largest is " + largest(firstNum, secondNum, thirdNum));
        System.out.println("The smallest is " + smallest(firstNum, secondNum, thirdNum));


    }

    private static int largest(int num1, int num2, int num3){
        int largest = 0;
        if(num1 > num2 && num1 > num3){
          largest =  num1;
        }else if (num2 > num1 && num2 > num3){
            largest = num2;
        }else {
            largest = num3;
        }
        return largest;
    }

    private static int smallest(int num1, int num2, int num3){
        int smallest = 0;
        if(num1 < num2 && num1 < num3){
            smallest =  num1;
        }else if (num2 < num1 && num2 < num3){
            smallest = num2;
        }else {
            smallest = num3;
        }
        return smallest;
    }
}
