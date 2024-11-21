// tracks highest temperature and the month which has that temperature.

import java.util.Scanner;

public class HighestTemperatureMonth {

    // returns the month number.
    public int highesTemperatureMonthNumber()
    {
        int monthCount = 1;
        double highTemp = -99999999.0;

        Scanner sc = new Scanner(System.in);

        for(int i=1; i<=12; i++)
        {
            System.out.printf("Enter temperature %d: ",i);
            double temp = sc.nextDouble();

            if(temp >= highTemp)
            {
                highTemp = temp;
                monthCount = i;
            }
        }

        sc.close();

        return monthCount;
    }

    // returns highest temperature month name.
    public String monthName(int monthCount)
    {
        if(monthCount == 1) return "January";
        else if(monthCount == 2) return "February";
        else if(monthCount == 3) return "March";
        else if(monthCount == 4) return "April";
        else if(monthCount == 5) return "May";
        else if(monthCount == 6) return "June";
        else if(monthCount == 7) return "July";
        else if(monthCount == 8) return "August";
        else if(monthCount == 9) return "September";
        else if(monthCount == 10) return "October";
        else if(monthCount == 11) return "November";
        else return "December";
    }
}