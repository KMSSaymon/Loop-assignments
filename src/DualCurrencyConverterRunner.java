import java.util.Scanner;

public class DualCurrencyConverterRunner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DualCurrencyConverter dualCurrencyConverter = new DualCurrencyConverter();

        // taking dollar to yen rate.
        System.out.print("\nEnter today's Dollar to Yen rate: ");
        double rate = sc.nextDouble();

        // dollar to yen conversion process.
        System.out.println("\n\tConverting USD to JPY:\n");
        while(true)
        {
            System.out.print("\nEnter Dollar amount (0 to terminate): ");
            double dollar = sc.nextDouble();

            if(dollar == 0)
            {
                break;
            }

            // prints result
            System.out.printf("$%.2f is equal to %.2f yen\n",dollar,dualCurrencyConverter.dollarToYen(rate, dollar));

        }


        // yen to dollar conversion process. 
        System.out.println("\n\tConverting JPY to USD:\n");
        while(true)
        {

            System.out.print("\nEnter Yen amount (0 to terminate): ");
            double yen = sc.nextDouble();

            if(yen == 0)
            {
                System.out.print("\n\tThanks for using the program.\n");
                break;
            }

            // prints result
            System.out.printf("%.2f Yen is equal to $%.2f\n",yen,dualCurrencyConverter.yenToDollar(rate, yen));

        }

        sc.close();
    }
}