import java.util.Scanner;

public class DataSetRunner {


    public static void main(String[] args) {

        double arr[];

        Scanner sc = new Scanner(System.in);
        DataSet dataSet = new DataSet();

        System.out.println("\n\t\t\t\tWelcome to the program\n");

        // taking array size input.
        System.out.print("How many numbers you want to input: ");
        int size = sc.nextInt();

        arr = new double[size];

        // taking array elements input.
        System.out.print("Enter numbers: ");
        for(int i=0; i<size; i++)
        {
            arr[i] = sc.nextDouble();
        }

        while(true)
        {
            dataSet.optionDisplay();
            System.out.print("Enter your choice: ");
            int option = sc.nextInt();


            if(option == 1)
            {
                for(int i=0; i<size; i++)
                {
                    dataSet.add(arr[i]);
                }
                double average = dataSet.getAverage(size);
                System.out.printf("\n\tAverage: %.2f\n\n",average);
            }
            else if(option == 2)
            {
                double smallest = dataSet.getSmallest(arr, size);
                System.out.printf("\n\tSmallest number: %.2f\n\n",smallest);
            }
            else if(option == 3)
            {
                double largest = dataSet.getLargest(arr, size);
                System.out.printf("\n\tLargest number: %.2f\n\n",largest);
            }
            else if(option == 4)
            {
                double range = dataSet.getRange(arr, size);
                System.out.printf("\n\tRange is: %.0f\n\n",range);
            }
            else if(option == 5)
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