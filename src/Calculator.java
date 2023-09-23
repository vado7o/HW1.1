import static org.assertj.core.api.Assertions.*;

public class Calculator {
    public static double calculateDiscount(int sum, int discount) {

        if (discount < 0.5 || discount > 99 || sum < 0.5) throw new ArithmeticException();

        return (double) sum - ((double) discount * (double) sum/100.0);
    }
}
