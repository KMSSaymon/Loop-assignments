import java.util.Scanner;

public class NumberOperationRunner {

    public static void main(String args[])
    {
        NumberOperation numberOperation = new NumberOperation();
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\t\t\t\tWelcome to the program\n");

        int[] arr;
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        arr = new int[size];

        System.out.print("Enter array elements: ");
        for(int i=0; i<size; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("\n\n");

        while(true)
        {
            numberOperation.optionDisplay();
            System.out.print("Enter your choice: ");
            int option = sc.nextInt();


            if(option == 1)
            {
                int ans = numberOperation.getSmallest(size, arr);
                System.out.printf("\n\tSmallest number: %d\n\n",ans);
            }
            else if(option == 2)
            {
                int ans = numberOperation.getLargest(size, arr);
                System.out.printf("\n\tLargest number: %d\n\n",ans);
            }
            else if(option == 3)
            {
                int even = numberOperation.numberOfEvens(size, arr);
                int odd = numberOperation.numberOfOdds(size, arr);
                System.out.printf("\n\tNumber of Evens: %d\n\n",even);
                System.out.printf("\n\tNumber of Odds: %d\n\n",odd);
            }
            else if(option == 4)
            {
                System.out.print("\n\tCumulative totals: ");
                numberOperation.cumulativeTotals(size, arr);
                System.out.print("\n\n");
            }
            else if(option == 5)
            {
                System.out.print("\n\tAdjacent duplicates: ");
                numberOperation.adjacentDuplicates(size, arr);
                System.out.print("\n\n");
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