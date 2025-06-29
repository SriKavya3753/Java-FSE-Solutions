public class FinancialForecastingIterative {

    // Iterative method to calculate future value
    public static double calculateFutureValueIterative(double presentValue, double growthRate, int periods) {
        double futureValue = presentValue;
        for (int i = 0; i < periods; i++) {
            futureValue *= (1 + growthRate);
        }
        return futureValue;
    }

    public static void main(String[] args) {
        // Test the iterative method
        double presentValue = 1000; // Initial investment
        double growthRate = 0.05;  // Annual growth rate (5%)
        int periods = 5;           // Number of years

        double futureValue = calculateFutureValueIterative(presentValue, growthRate, periods);
        System.out.printf("The future value after %d years is: %.2f", periods, futureValue);
    }
}
