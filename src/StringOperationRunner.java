import java.util.Scanner;

public class StringOperationRunner {


    public static void main(String args[])
    {
        StringOperation stringOperation = new StringOperation();
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\t\t\t\tWelcome to the program\n");

        System.out.print("Enter a String: ");
        String st = sc.nextLine();
        System.out.print("\n\n");

        while(true)
        {
            // printing options
            stringOperation.optionDisplay();

            int option;

            option = sc.nextInt();


            if(option == 1)
            {
                System.out.printf("\n\tPrinting all the upper case letters of input string.\n\t");
                stringOperation.printUppercaseLetters(st);
                System.out.print("\n\n");
            }
            else if(option == 2)
            {
                System.out.print("\n\tPrinting every second letter of every word in the string.\n");
                stringOperation.printSecondLetter(st);
                System.out.print("\n\n");
            }
            else if(option == 3)
            {
                String answer = stringOperation.removeVowels(st);
                System.out.printf("\n\tThe string: %s\n\n",answer);
            }
            else if(option == 4)
            {
                int ans = stringOperation.countVowels(st);
                System.out.printf("\n\tNumber of vowels in the string.: %d\n\n",ans);
            }
            else if(option == 5)
            {
                System.out.printf("\n\tPositions of all vowels: ");
                stringOperation.positionOfVowels(st);
                System.out.println("\n\n");
            }
            else if(option == 6)
            {
                sc.close();
                System.out.println("\n\t\t\t\tThank you for using the program.\n");
                break;
            }
            else
            {
                System.out.println("\n\tWrong input!Please see the options.\n");
            }

        }

    }
}