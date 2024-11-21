// This class does the following:
// 1. Converts Dollar to Yen. Terminates by 0 input.
// 2. Converts Yen to Dollar. Terminates by 0 input.


public class DualCurrencyConverter {

    // converts dollar to yen and returns the amount.
    public double dollarToYen(double rate, double amount)
    {
        return rate*amount;
    }

    // converts yen to dollar and returns the amount.
    public double yenToDollar(double rate, double amount)
    {
        return amount/rate;
    }
}