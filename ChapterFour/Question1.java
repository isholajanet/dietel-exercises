package ChapterFour;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       int miles = 0;
       int gallons = 0;
       int count = 0;
       int totalmiles = 0;
       int totalgallons = 0;

        while (miles != -1 || gallons != -1){

            System.out.print("Enter the miles driven or -1 to stop the application: ");
            miles = input.nextInt();
            System.out.print("Enter the gallons used or -1 to stop the application: ");
            gallons = input.nextInt();
             count++;
             totalmiles += miles;
             totalgallons += gallons;

        }

        int gasMileage = totalmiles / totalgallons;

        System.out.println("Gas mileage is " + gasMileage);
    }
}
