package ChapterTwo;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNum = input.nextInt();
        System.out.print("Enter the second number: ");
        int secondNum = input.nextInt();
        System.out.print("Enter the third number: ");
        int thirdNum = input.nextInt();
        System.out.print("Enter the fourth number: ");
        int fourthNum = input.nextInt();
        System.out.print("Enter the fifth number: ");
        int fifthNum = input.nextInt();

        int largestNumber = 0;
        int smallestNumber = 0;

        if( firstNum > secondNum && firstNum > thirdNum && firstNum > fourthNum && firstNum > fifthNum){
            largestNumber = firstNum;
        } else if ( secondNum > firstNum && secondNum > thirdNum && secondNum > fourthNum && secondNum > fifthNum){
            largestNumber = secondNum;
        } else if( thirdNum > firstNum && thirdNum > secondNum && thirdNum > fourthNum && thirdNum > fifthNum){
           largestNumber = thirdNum;
        } else if ( fourthNum > firstNum && fourthNum > secondNum && fourthNum > thirdNum && fourthNum > fifthNum){
            largestNumber = fourthNum;
        } else {
            largestNumber = fifthNum;
        }

        if( firstNum < secondNum && firstNum < thirdNum && firstNum < fourthNum && firstNum < fifthNum){
            smallestNumber = firstNum;
        } else if ( secondNum < firstNum && secondNum < thirdNum && secondNum < fourthNum && secondNum < fifthNum){
            smallestNumber = secondNum;
        } else if( thirdNum < firstNum && thirdNum < secondNum && thirdNum < fourthNum && thirdNum < fifthNum){
            smallestNumber = thirdNum;
        } else if ( fourthNum < firstNum && fourthNum < secondNum && fourthNum < thirdNum && fourthNum < fifthNum){
            smallestNumber = fourthNum;
        } else {
            smallestNumber = fifthNum;
        }

        System.out.println("The largest number is "+ largestNumber);
        System.out.println("The smallest number is "+ smallestNumber);
    }
}
