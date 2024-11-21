// This class prints a diamond shape, with the asterisks in the middle
// row and column omitted, like this:
// 
//   * *
//  ** **
// *** ***
// 
// *** ***
//  ** **
//   * *

public class HollowDiamondPattern {

    // prints the pattern.
    public void patternPrinter(int limit)
    {
        // prints upper portion of the pattern.
        for(int row=1; row<limit; row++)
        {
            // front space printer.
            for(int col=1; col<=limit-row; col++)
            {
                System.out.print(" ");
            }

            // asterisk printer
            for(int col=1; col<=row; col++)
            {
                System.out.print("*");
            }

            // mid space printer
            System.out.print(" ");

            // asterisk printer
            for(int col=1; col<=row; col++)
            {
                System.out.print("*");
            }

            // new line
            System.out.println();

        }

        // middle new line 
        System.out.println();

        // prints lower portion of the pattern.
        for(int row=limit-1; row>=1; row--)
        {
            // front space printer.
            for(int col=1; col<=limit-row; col++)
            {
                System.out.print(" ");
            }

            // asterisk printer
            for(int col=1; col<=row; col++)
            {
                System.out.print("*");
            }

            // mid space printer
            System.out.print(" ");

            // asterisk printer
            for(int col=1; col<=row; col++)
            {
                System.out.print("*");
            }

            // new line
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