import java.util.Scanner;


public class CurrencyConverterRunner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CurrencyConverter currencyConverter = new CurrencyConverter();

        // taking dollar to yen rate.
        System.out.print("\nEnter today's Dollar to Yen rate: ");
        double rate = sc.nextDouble();

        System.out.println("\n\tConverting USD to JPY:\n");
        while(true)
        {
            System.out.print("\nEnter Dollar amount (0 to end): ");
            double dollar = sc.nextDouble();

            if(dollar == 0)
            {
                System.out.print("\n\tThanks for using the program.\n");
                break;
            }

            // prints result
            System.out.printf("$%.2f is equal to %.2f yen\n",dollar,currencyConverter.converter(rate, dollar));

        }

        sc.close();
    }
}