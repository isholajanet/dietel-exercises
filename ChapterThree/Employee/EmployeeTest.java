package ChapterThree.Employee;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the employee's first name: ");
        String firstName = input.nextLine();
        System.out.print("Enter the employee's last name: ");
        String lastName = input.nextLine();
        System.out.print("Enter the salary: ");
        double salary = input.nextDouble();
        Employee employee = new Employee(firstName, lastName, salary);

        System.out.printf("%s %s salary is $%.2f%n ", employee.getFirstName(), employee.getLastName(), employee.getSalary());

        employee.raise(15);

        System.out.printf("%s %s new salary after the raise is $%.2f ", employee.getFirstName(), employee.getLastName(), employee.getSalary());

    }
}
