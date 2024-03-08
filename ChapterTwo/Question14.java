package ChapterTwo;

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the weight of the user(pounds): ");
        int weight = input.nextInt();
        System.out.print("Enter the height of the user(inches): ");
        int height = input.nextInt();

        int bmi = (weight * 703) / (height * height);

        if (bmi < 18.5){
            System.out.println("You are underweight");
        } else if ( bmi >= 18.5 && bmi <= 24.9){
            System.out.println("You are normal");
        } else if( bmi >= 25 && bmi <= 29.9) {
            System.out.println("You are overweight");
        } else{
            System.out.println("You are obese!!!!");
        }
    }
}
