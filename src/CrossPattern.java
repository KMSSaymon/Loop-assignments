// This class prints an X shape in a box of a given side length, like this:
// ********
// **    **
// * *  * *
// *  **  *
// *  **  *
// * *  * *
// **    **
// ********

public class CrossPattern {

    // prints the pattern
    public void patternPrinter(int limit)
    {
        for(int row = 1; row<= limit*2; row++)
        {
            for(int col=1; col<=limit*2; col++)
            {
                // prints the last and first horizontal lines of the pattern.
                if(row == 1 || row == limit*2)
                {
                    System.out.print("*");
                }
                // prints the last and first upright lines of the pattern
                else if(col == 1 || col == limit*2)
                {
                    System.out.print("*");
                }
                // prints the x shape inside the box.
                else if(row == col)
                {
                    System.out.print("*");
                }
                else if(row+col-1 == limit*2)
                {
                    System.out.print("*");
                }
                // prints the spaces inside the box.
                else
                {
                    System.out.print(" ");
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