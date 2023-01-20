import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;




public class StringCalculatorTest {

    @Test
    public void sumsEmptyStringToZero() {
        assertThat(StringCalculator.sum("")).isEqualTo(0);
    }

    @Test
    public void sumsSingleNumber() {
        assertThat(StringCalculator.sum("5")).isEqualTo(5);
        assertThat(StringCalculator.sum("42")).isEqualTo(42);
    }
}
