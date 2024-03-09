package ChapterThree.HeartRateCalculator;

import ChapterThree.Date.Date;

public class HeartRateTest {

    public static void main(String[] args) {

        Date date = new Date(9, 3, 1998);

        HeartRates heartRates = new HeartRates("janet", "ishola", date);


        System.out.println("User's age is " + heartRates.calculateAge());
        System.out.println("User's maximum heart age is " + heartRates.calculateMaximumHeartBeat());

    }
}
