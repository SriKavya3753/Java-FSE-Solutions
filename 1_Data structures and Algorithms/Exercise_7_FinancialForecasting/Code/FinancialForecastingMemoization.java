import java.util.HashMap;
import java.util.Map;

public class FinancialForecastingMemoization {

    // Map to store previously computed results
    private static Map<Integer, Double> memo = new HashMap<>();

    // Recursive method with memoization
    public static double calculateFutureValue(double presentValue, double growthRate, int periods) {
        // Base Case: No more periods
        if (periods == 0) {
            return presentValue;
        }

        // Check if the result is already computed
        if (memo.containsKey(periods)) {
            return memo.get(periods);
        }

        // Recursive computation
        double result = calculateFutureValue(presentValue * (1 + growthRate), growthRate, periods - 1);

        // Store the result in the memo map
        memo.put(periods, result);

        return result;
    }

    public static void main(String[] args) {
        // Test the memoized recursive method
        double presentValue = 1000; // Initial investment
        double growthRate = 0.05;  // Annual growth rate (5%)
        int periods = 5;           // Number of years

        double futureValue = calculateFutureValue(presentValue, growthRate, periods);
        System.out.printf("The future value after %d years is: %.2f", periods, futureValue);
    }
}
