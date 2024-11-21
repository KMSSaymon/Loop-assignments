import java.util.*;

public class CalculationsRunner {

    public static void main(String args[])
    {
        Calculations calculations = new Calculations();
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\t\t\t\tWelcome to the program\n");

        while(true)
        {
            calculations.optionDisplay();
            System.out.print("Enter your choice: ");
            int option = sc.nextInt();


            if(option == 1)
            {
                Long sumOfEven = calculations.sumOfEvenNumbers(2L, 100L);
                System.out.printf("\n\tSum of even numbers from 2 to 100: %d\n\n",sumOfEven);
            }
            else if(option == 2)
            {
                Long resultOfSumOfSquare = calculations.sumOfSquares();
                System.out.printf("\n\tSum of squares from 1 to 100: %d\n\n",resultOfSumOfSquare);
            }
            else if(option == 3)
            {
                // printing power of 2 from 0 to 20.
                System.out.println("\n\tPrinting results of 2^0 to 2^20\n");
                calculations.powerOfTwo();
                System.out.println();
            }
            else if(option == 4)
            {
                System.out.println("\n\tCalulator of sum of odd numbers in a given range.\n");

                // taking input.

                System.out.print("\tEnter start point: ");
                Long a = sc.nextLong();
                System.out.print("\tEnter ending point: ");
                Long b = sc.nextLong();

                Long sumOfOdd = calculations.sumOfOddNumbers(a,b);
                System.out.printf("\n\tSum of odd numbers: %d\n\n",sumOfOdd);
            }
            else if(option == 5)
            {
                System.out.println("\n\tCalulator of sum of odd digits from a number.\n");

                // taking input from user.

                System.out.print("\tEnter a number: ");
                Long number = sc.nextLong();

                Long resultOfOddDigits = calculations.sumOfOddDigits(number);
                System.out.printf("\n\tSum of odd digits: %d\n\n",resultOfOddDigits);
            }
            else if(option == 6)
            {
                System.out.println("\n\t\t\t\tThank you for using the program.\n");
                sc.close();
                break;
            }
            else
            {
                System.out.println("\n\tWrong input!Please see the options.\n");
            }
        }

    }
}
