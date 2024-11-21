
public class HighestTemperatureMonthRunner {

    public static void main(String[] args) {

        HighestTemperatureMonth highestTemperatureMonth = new HighestTemperatureMonth();

        System.out.println("\n");

        int monthNumber = highestTemperatureMonth.highesTemperatureMonthNumber();

        String monthName = highestTemperatureMonth.monthName(monthNumber);

        System.out.println("\n Month name having highest temperature: " + monthName + "\n");
    }
}