// This class does the following:
// a. Returns smallest and largest of the inputs.
// b. The number of even and odd inputs.
// c. Cumulative totals. For example, if the input is 1 7 2 9, the program will print
// 1 8 10 19.
// d. All adjacent duplicates. For example, if the input is 1 3 3 4 5 5 6 6 6 2, the
// program will print 3 5 6.
import java.util.Arrays;

public class NumberOperation {

    // returns smallest of the inputs.
    public int getSmallest(int size, int arr[])
    {
        int mini = arr[0];

        for(int i=1; i<size; i++)
        {
            mini = Math.min(mini,arr[i]);
        }

        return mini;
    }

    // returns largest of the inputs
    public int getLargest(int size, int arr[])
    {
        int maxi = arr[0];

        for(int i=1; i<size; i++)
        {
            maxi = Math.max(maxi,arr[i]);
        }

        return maxi;
    }

    // returns number of even inputs.
    public int numberOfEvens(int size, int arr[])
    {
        int count = 0;

        for(int i=0; i<size; i++)
        {
            if(arr[i]%2==0) count++;
        }

        return count;
    }

    // returns number of odd inputs
    public int numberOfOdds(int size, int arr[])
    {
        int count = 0;

        for(int i=0; i<size; i++)
        {
            if(arr[i]%2==1) count++;
        }

        return count;
    }

    // prints cumulative totals
    public void cumulativeTotals(int size, int arr[])
    {
        int count = arr[0];
        System.out.print(count + " ");

        for(int i=1; i<size; i++)
        {
            count += arr[i];

            System.out.print(count + " ");
        }

        return;
    }

    // prints all adjacent duplicates.
    public void adjacentDuplicates(int size, int arr[])
    {
        Arrays.sort(arr);
        for(int i=0; i<size-1; i++)
        {
            if(arr[i] == arr[i+1])
            {
                System.out.print(arr[i] + " ");

                int val = arr[i];
                while(i < size-1 && arr[i+1] == val)
                {
                    i++;
                }
            }
        }
    }

    // option displayer of the program.
    public void optionDisplay()
    {
        System.out.println("\t\tOption-1 : Find smallest number.");
        System.out.println("\t\tOption-2 : Find largest number.");
        System.out.println("\t\tOption-3 : Number of even and odd inputs.");
        System.out.println("\t\tOption-4 : Cumulative total of input.");
        System.out.println("\t\tOption-5 : All adjacent duplicates.");
        System.out.println("\t\tOption-6 : Exit the program.\n");

    }
}