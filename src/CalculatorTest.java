import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    public static void main(String[] args) {
        // первая проверка
        assertThat(Calculator.calculateDiscount(555, 9)).isEqualTo(505.05);
        System.out.println(Calculator.calculateDiscount(555,9 ));

        // вторая проверка
        assertThat(Calculator.calculateDiscount(990, 10)).isEqualTo(891);
        System.out.println(Calculator.calculateDiscount(990, 10));

        // Проверка выброса исключения ArithmeticException
        assertThatExceptionOfType(ArithmeticException.class).isThrownBy(() -> System.out.println(Calculator.calculateDiscount(100, 101)));

    }
}
