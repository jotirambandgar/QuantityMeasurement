import com.bridgelabz.Feet;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void whenGivenLengthInZeroFeetAndZeroFeetShouldReturnEqual() {

        Feet feet = new Feet(0);
        Feet feet1 = new Feet(0);
        Assert.assertEquals(feet1,feet);

    }

}
