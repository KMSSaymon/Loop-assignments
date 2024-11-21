// this class does the following things-
// 1. The average of the values
// 2. Smallest of the values.
// 3. Largest of the values.
// 4. Difference between the smallest and largest.

import java.lang.Math;

public class DataSet
{
    private double sum = 0;

    // calculates the total sum of inputs.
    public void add(double value)
    {
        sum = sum + value;
    }

    // returns the average of the values.
    public double getAverage(double totalNumbers)
    {

        return sum/totalNumbers;
    }

    // returns the smallest of the values.
    public double getSmallest(double value[], int size)
    {
        double smallestNumber = value[0];

        for(int i=1; i<size; i++)
        {
            smallestNumber = Math.min(smallestNumber,value[i]);
        }

        return smallestNumber;
    }

    // returns the largest of the values.
    public double getLargest(double value[], int size)
    {
        double largestNumber = value[0];

        for(int i=1; i<size; i++)
        {
            largestNumber = Math.max(largestNumber,value[i]);
        }

        return largestNumber;
    }

    // returns the difference between smallest and largest.
    public double getRange(double value[], int size)
    {
        double smallNumber = getSmallest(value, size);
        double largeNumber = getLargest(value, size);

        return largeNumber-smallNumber;
    }

    // option displayer of the program.
    public void optionDisplay()
    {
        System.out.println("\t\tOption-1 : Calculate average of the values.");
        System.out.println("\t\tOption-2 : Get smallest number of all values.");
        System.out.println("\t\tOption-3 : Get largest number of all values.");
        System.out.println("\t\tOption-4 : Get difference between smallest and largest number.");
        System.out.println("\t\tOption-5 : Exit the program.\n");

    }
}