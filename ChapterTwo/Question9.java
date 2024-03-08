package ChapterTwo;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        int radius = input.nextInt();

        System.out.printf("The diameter of the circle is %d%n", 2 * radius);
        System.out.printf("The circumference of the circle is %f%n", 2 * Math.PI * radius);
        System.out.printf("The area of the circle is %f%n", Math.PI * (radius * radius) );
    }
}
