public class FinancialForecastingRecursive {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double presentValue, double growthRate, int periods) {
        // Base Case: No more periods
        if (periods == 0) {
            return presentValue;
        }
        // Recursive Case: Calculate for remaining periods
        return calculateFutureValue(presentValue * (1 + growthRate), growthRate, periods - 1);
    }

    public static void main(String[] args) {
        // Test the recursive method
        double presentValue = 1000; // Initial investment
        double growthRate = 0.05;  // Annual growth rate (5%)
        int periods = 5;           // Number of years

        double futureValue = calculateFutureValue(presentValue, growthRate, periods);
        System.out.printf("The future value after %d years is: %.2f", periods, futureValue);
    }
}
