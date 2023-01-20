import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;




public class StringCalculatorTest {

    @Test
    public void sumsEmptyStringToZero() {
        assertThat(StringCalculator.sum("")).isEqualTo(0);
    }
}
