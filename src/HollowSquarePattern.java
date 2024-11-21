// This class displays, using asterisks, a filled and hollow square, placed next to each other. 
// For example, if the side length is 5, the program should display

// ***** *****
// ***** *   *
// ***** *   *
// ***** *   *
// ***** *****

public class HollowSquarePattern {

    //prints the pattern.
    public void patternPrinter(int limit)
    {
        int rowLimit = limit;
        int coloumnLimit = limit*2+2;
        int mid = coloumnLimit/2;

        for(int row=1; row<=rowLimit; row++)
        {
            for(int col=1; col<coloumnLimit; col++)
            {
                // prints the middle space.
                if(col == mid)
                {
                    System.out.print(" ");
                }
                // prints filled pattern before the middle space.
                else if(col < mid)
                {
                    System.out.print("*");
                }
                // prints hollow square pattern after the middle space.
                else if(col > mid)
                {
                    if(row == 1 || row == rowLimit)
                    {
                        System.out.print("*");
                    }
                    else if(col ==  mid+1 || col == coloumnLimit-1)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    // option displayer of the program.
    public void optionDisplay()
    {
        System.out.println("\t\tOption-1 : Generate pattern.");
        System.out.println("\t\tOption-2 : Exit the program.\n");
    }
}