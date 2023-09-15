import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MaximumNumberTest {
    MaximumNumber maximumNumber;

    @BeforeEach
    public void setUp() {
        maximumNumber = new MaximumNumber();
    }

    @Test
    public void findMaxInArray() {
        double arr[] = {4.5, 5.5, 7.5};
        double MaximumNumber = maximumNumber.findMax(arr);

        Assertions.assertEquals(7.5 ,MaximumNumber);
    }
}
