
public class Main {
	public static double calculateFutureValue(double amount, double rate, int years) {
        if (years == 0) {
            return amount;
        }
        return calculateFutureValue(amount * (1 + rate), rate, years - 1);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double currentValue = 10000; 
        double growthRate = 0.10;
        int numberOfYears = 5;

        double futureValue = calculateFutureValue(currentValue, growthRate, numberOfYears);

        System.out.printf("Future Value after "+numberOfYears+" years: Rs%.2f\n", futureValue);

	}

}
