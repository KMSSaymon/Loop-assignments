import java.util.Scanner;

public class CrossPatternRunner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CrossPattern crossPattern = new CrossPattern();

        System.out.println("\n\t\t\t\tWelcome to the program\n\n");

        while(true)
        {
            crossPattern.optionDisplay();
            System.out.print("Enter your choice: ");
            int option = sc.nextInt();

            if(option == 1)
            {
                System.out.print("Enter a number: ");
                int number = sc.nextInt();

                System.out.print("\nPattern generated below: \n\n");

                crossPattern.patternPrinter(number);
                System.out.println();
            }
            else if(option == 2)
            {
                System.out.println("\n\t\t\t\tThank you for using the program.\n");
                sc.close();
                break;
            }
            else
            {
                System.out.println("\n\tWrong input! Please see the options.\n");
            }
        }
    }
}