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

    @Test
    public void sumsTwoNumbersSeparatedByComa() {
        assertThat(StringCalculator.sum("3,2")).isEqualTo(5);
    }

    @Test
    public void sumsThreeNumbersSeparatedByComa() {
        assertThat(StringCalculator.sum("3,2,1")).isEqualTo(6);
    }

    @Test
    public void sumsNumberDelimitedByNewLine() {
        assertThat(StringCalculator.sum("1\n2")).isEqualTo(3);
    }

}
