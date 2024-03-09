package ChapterThree.Employee;

public class Employee {

    private String firstName;
    private String lastName;
    private double salary;

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (salary > 0.0){
            this.salary = salary;
        }

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public double raise (double increasePercent){
        double increaseAmount = increasePercent/100 * salary;
        salary = increaseAmount + salary;
        return salary;
    }

}
