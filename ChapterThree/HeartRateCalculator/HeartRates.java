package ChapterThree.HeartRateCalculator;

import ChapterThree.Date.Date;

import java.time.Instant;
import java.time.LocalDate;

public class HeartRates {
    private String firstName;
    private String lastName;
    private Date date;

    public HeartRates(String firstName, String lastName, Date date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.date = date;
    }

    public Date getDate() {
        return date;
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

    public int calculateAge(){
        LocalDate localDate = LocalDate.now();
        int year =  localDate.getYear();;
        return year - date.getYear();
    }

    public int calculateMaximumHeartBeat(){
        return 220 - calculateAge();
    }

}
