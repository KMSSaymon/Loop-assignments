// Write a program that prints all powers of 2 from 20 up to 220

public class PowerCalculator {

    // returns power of 2.
    public Long generatePowerOfTwo(Long limit)
    {
        Long result = 1L;
        for(Long i=1L; i<=limit; i++)
        {
            result = result * 2;
        }

        return result;
    }

    // prints all powers of 2 from 2^0 up to 2^20.
    public void powerOfTwo()
    {
        for(Long i=0L; i<=20; i++)
        {
            System.out.printf("\t2 to the power %d = %d\n",i,generatePowerOfTwo(i));
        }

    }
}